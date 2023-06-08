package be.coworking.auth;

import be.coworking.auth.payload.AuthenticationSuccessfull;
import be.coworking.entities.User;
import be.coworking.entities.payloads.UserLogin;
import be.coworking.entities.payloads.UserRegistration;
import be.coworking.exceptions.NotFound;
import be.coworking.exceptions.Unauthorized;
import be.coworking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody @Validated UserRegistration body){
        User createdUser = userService.create(body);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationSuccessfull> login(@RequestBody UserLogin body)
            throws NotFound {

        // 1. Verificare che l'email dell'utente sia presente nel db
        User user = userService.findByEmail(body.getEmail());

        // 2. In caso affermativo devo verificare che la pw corrisponda a quella trovata
        // nel db
        String token;
        if (!body.getPassword().matches(user.getPassword())) {
            throw new Unauthorized("Credenziali non valide");
        } else {
            // 3. Se tutto ok --> genero
            token = JWTTools.createToken(user);
            // 4. Altrimenti --> 401 ("Credenziali non valide")
            return new ResponseEntity<>(new AuthenticationSuccessfull(token), HttpStatus.OK);
        }


    }

}
