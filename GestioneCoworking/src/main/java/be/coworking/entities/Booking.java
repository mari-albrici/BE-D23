package be.coworking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Booking {

   @Id
   @GeneratedValue
    private UUID id;
    private LocalDate date;

    @ManyToOne
    private User userId;

    @ManyToOne
    private Workstation workstationId;
}
