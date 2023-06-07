package be.coworking.controllers;

import be.coworking.exceptions.UnknownLanguage;
import be.coworking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingService bookingservice;

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

}
