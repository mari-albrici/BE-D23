package be.coworking.runners;

import be.coworking.entities.Building;
import be.coworking.services.BuildingService;
import be.coworking.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BuildingRunner implements CommandLineRunner {

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private CityService cityService;

    @Autowired
    private PasswordEncoder bcrypt;

    @Override
    public void run(String... args){
//       Building buildingOne = new Building();
//       buildingOne.setName("Building A");
//       buildingOne.setAddress("5th Avenue");
//       buildingOne.setCity(cityService.findById(UUID.fromString("cc36f718-f989-45b3-bab2-f2f71b0234e2")));
//       buildingOne.setAccessCode(bcrypt.encode("1A2B3C4D"));
//       buildingService.create(buildingOne);
//
//       Building buildingTwo = new Building();
//       buildingTwo.setName("Building B");
//       buildingTwo.setAddress("Ocean Boulevard");
//       buildingTwo.setCity(cityService.findById(UUID.fromString("cc36f718-f989-45b3-bab2-f2f71b0234e2")));
//       buildingOne.setAccessCode(bcrypt.encode("5E6F7G8H"));
//       buildingService.create(buildingTwo);
    }
}
