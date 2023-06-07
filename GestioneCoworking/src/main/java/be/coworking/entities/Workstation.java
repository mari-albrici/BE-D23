package be.coworking.entities;

import be.coworking.entities.enums.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Workstation {

    @Id
    @GeneratedValue
    private UUID id;

    private String description;
    private Type type;
    private int seats;

    @ManyToOne
    private Building building;

}
