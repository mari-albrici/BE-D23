package be.coworking.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Booking {
    private int id;
    private LocalDate date;
    private User userId;
    private Workstation workstationId;
}
