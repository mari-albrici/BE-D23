package be.coworking.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "bookings")
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
