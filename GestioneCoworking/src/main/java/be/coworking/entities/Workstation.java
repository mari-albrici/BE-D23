package be.coworking.entities;

import be.coworking.entities.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Workstation {
    private int id;
    private String description;
    private Type type;
    private int seats;
    private Building building;

}
