package be.coworking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Building {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private City city;

}
