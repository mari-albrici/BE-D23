package be.coworking.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "buildings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Building {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;

    @ManyToOne
    private City city;

    public Building(String name, String address, City city) {
    }
}
