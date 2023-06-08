package be.coworking.runners;

import be.coworking.entities.User;
import be.coworking.services.UserService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;
@Component
public class UserRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Override
    public void run(String... args){

        Faker faker = new Faker(new Locale("it"));

        for (int i = 0; i < 3; i++)
            try {
                User user = new User();
                user.setName(faker.name().firstName());
                user.setLastname(faker.name().lastName());
                user.setEmail(faker.internet().emailAddress());
                user.setUsername(faker.name().username());
//                userService.create(user);
            } catch (Exception e) {
                System.out.println(e);
            }

    }

}
