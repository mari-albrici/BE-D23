package be.coworking.runners;

import be.coworking.entities.Building;
import be.coworking.services.BuildingService;
import be.coworking.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BuildingRunner implements CommandLineRunner {

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private CityService cityService;

    @Override
    public void run(String... args){
       Building buildingOne = new Building();
       buildingOne.setName("Building A");
       buildingOne.setAddress("5th Avenue");
       buildingOne.setCity(cityService.findById(UUID.fromString("3b50ebd8-e70d-41b6-aa23-cc85d060c91a")));
//       buildingService.create(buildingOne);

       Building buildingTwo = new Building();
       buildingTwo.setName("Building B");
       buildingTwo.setAddress("Ocean Boulevard");
       buildingTwo.setCity(cityService.findById(UUID.fromString("3b50ebd8-e70d-41b6-aa23-cc85d060c91a")));
       buildingService.create(buildingTwo);
    }
}
