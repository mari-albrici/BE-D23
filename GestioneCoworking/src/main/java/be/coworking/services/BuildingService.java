package be.coworking.services;

import be.coworking.entities.Building;
import be.coworking.entities.City;
import be.coworking.entities.User;
import be.coworking.exceptions.NotFound;
import be.coworking.repositories.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepo;

    public Building create(Building b){
        return buildingRepo.save(b);
    }

    public Building findById(UUID id) throws NotFound {
        return buildingRepo.findById(id).orElseThrow(() -> new NotFound("Building not found"));
    }
}
