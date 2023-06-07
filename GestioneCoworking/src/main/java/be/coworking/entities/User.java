package be.coworking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String name;
    private String lastname;
    private String email;



}
