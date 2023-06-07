package be.coworking.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String username;
    private String name;
    private String lastname;
    private String email;



}
