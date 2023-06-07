package be.coworking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
public class City {

    @Id
    private String name;
}
