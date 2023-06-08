package be.coworking.runners;

import be.coworking.entities.Booking;
import be.coworking.services.BookingService;
import be.coworking.services.UserService;
import be.coworking.services.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
public class BookingRunner implements CommandLineRunner {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private WorkstationService workService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
//        Booking bookingOne = new Booking();
//        bookingOne.setWorkstationId(workService.findById(UUID.fromString("960f0827-4af5-4384-bcc7-b97693042d2f")));
//        bookingOne.setDate(LocalDate.of(2023, 10, 5));
//        bookingOne.setUserId(userService.findById(UUID.fromString("51afc4f9-9755-4103-b6f7-4af92f55c96f")));
//        bookingService.create(bookingOne);
    }
}
