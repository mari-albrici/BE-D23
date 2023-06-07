package be.coworking.services;

import be.coworking.entities.*;
import be.coworking.entities.enums.Type;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class BookingService {
    private List<Booking> bookings = new ArrayList<>(List.of(
            new Booking(
                    1,
                    LocalDate.now(),
                    new User(1, "mariorossi", "Mario", "Rossi", "mariorossi@gmail.com"),
                    new Workstation(1, "coworking", Type.OPENSPACE, 10, new Building(1, "Block A", "Via Maj", new City("Milano"))))
    ));
}
