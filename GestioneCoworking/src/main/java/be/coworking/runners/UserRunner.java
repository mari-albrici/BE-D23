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
    private UserService userService;

    @Autowired
    public UserRunner(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void run(String... args){

        Faker faker = new Faker(new Locale("it"));

        for (int i = 0; i < 3; i++)
            try {
                String name = faker.name().firstName();
                String lastname = faker.name().lastName();
                String email = faker.internet().emailAddress();
                String username = faker.name().username();
                User user = new User(name, lastname, email, username);
                userService.create(user);
            } catch (Exception e) {
                System.out.println(e);
            }

    }

}
