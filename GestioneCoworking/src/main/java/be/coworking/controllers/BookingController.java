package be.coworking.controllers;

import be.coworking.entities.Booking;
import be.coworking.entities.User;
import be.coworking.exceptions.UnknownLanguage;
import be.coworking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/{lang}")
    public String home(@PathVariable String lang) {
        if(Objects.equals(lang, "en")){
            return "Welcome to the worstation booking section. Here are the rules: ...";
        } else if (Objects.equals(lang, "it")){
            return "Benvenuti alla prenotazione delle postazioni. Ecco le regole: ...";
        } else {
            throw new UnknownLanguage(lang);
        }
    }

    @GetMapping("")
    public List<Booking> getBooking(@RequestParam(defaultValue = "0") int page){
        return bookingService.find(page);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking saveBooking(@RequestBody Booking body) {
        return bookingService.create(body);
    }

    @GetMapping("/{bookingId}")
    public Booking getBooking(@PathVariable UUID bookingId) throws Exception {
        return bookingService.findById(bookingId);
    }

    @PutMapping("/{bookingId}")
    public Booking updateBooking(@PathVariable UUID bookingId, @RequestBody Booking body) throws Exception {
        return bookingService.findByIdAndUpdate(bookingId, body);
    }

    @DeleteMapping("/{bookingId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBooking(@PathVariable UUID bookingId) throws Exception {
        bookingService.findByIdAndDelete(bookingId);
    }

}
