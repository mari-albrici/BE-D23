package be.coworking.runners;

import be.coworking.entities.User;
import be.coworking.entities.Workstation;
import be.coworking.entities.enums.Type;
import be.coworking.services.BuildingService;
import be.coworking.services.UserService;
import be.coworking.services.WorkstationService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.UUID;

@Component
public class WorkstationRunner implements CommandLineRunner {
    @Autowired
    private WorkstationService workService;

    @Autowired
    private BuildingService buildingService;

    @Override
    public void run(String... args){
//        Workstation workOne = new Workstation("Single desk space", Type.PRIVATE, 1, buildingService.findById(UUID.fromString("1")));
//        workService.create(workOne);
    }

}
