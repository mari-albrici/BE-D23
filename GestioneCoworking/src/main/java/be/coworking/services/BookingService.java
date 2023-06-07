package be.coworking.services;

import be.coworking.entities.*;
import be.coworking.entities.enums.Type;
import be.coworking.exceptions.NotFound;
import be.coworking.repositories.BookingRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepo;

    public Booking create(Booking b){
        return bookingRepo.save(b);
    }

    public List<Booking> find(int page){
        Pageable pageable = PageRequest.of(page, 10);
        return bookingRepo.findAll();
    }

    public Booking findById(UUID id) throws NotFound {
        return bookingRepo.findById(id).orElseThrow(() -> new NotFound("Booking not found"));
    }

    public Booking findByIdAndUpdate(UUID id, Booking b) throws NotFound {
        Booking found = this.findById(id);

        found.setId(id);
        found.setDate(b.getDate());
        found.setUserId(b.getUserId());
        found.setWorkstationId(b.getWorkstationId());

        return bookingRepo.save(found);
    }

    public void findByIdAndDelete(UUID id) throws NotFound{
        Booking foundB = this.findById(id);
        bookingRepo.delete(foundB);
    }
}
