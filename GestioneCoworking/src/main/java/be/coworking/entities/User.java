package be.coworking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String name;
    private String lastname;
    private String email;


    public User(String name, String lastname, String email, String username) {
    }
}
