package be.coworking.controllers;

import be.coworking.entities.City;
import be.coworking.entities.Workstation;
import be.coworking.entities.enums.Type;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workstations")
public class WorkstationController {

//    @GetMapping("?type={type}&city={city}")
//    public Workstation workstation(@PathVariable Type type, City city){
//        return List<Workstation>;
//    }
}
