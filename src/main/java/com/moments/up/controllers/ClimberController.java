package com.moments.up.controllers;

import com.moments.up.models.Climber;
import com.moments.up.repositories.IClimberRepository;
import com.moments.up.services.ClimberService;
import com.moments.up.services.IClimberService;
import com.moments.up.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
    public class ClimberController {
    //DEPENDCI INVERSION-> DEPEND INYECTION->INVERSION OF CONTROLLER (IOC) -> SPRINGBOOT -> BEANS

    private IClimberService climberService;
    private IUserService userService;

    public ClimberController(IClimberService climberService, IUserService userService) {
        this.climberService = climberService;
        this.userService = userService;
    }

    @GetMapping("/climbers")
    List<Climber> getAll() {
        return climberService.findAll(); //torna tots els climbers
    }

    @GetMapping("/climbers/{id}")
    Climber getById(@PathVariable Long id) {
        return climberService.findById(id); //ens retorna un climber//
    }


    @PostMapping("/climbers")
    Climber createClimber(@RequestBody Climber newClimber) {
       return climberService.create(newClimber);  //crea un climber nou//
    }
    @PutMapping("/climbers/{id}")
    Climber updateClimber(@PathVariable Long id, @RequestBody Climber updatedClimber) {
        return climberService.update(id, updatedClimber);  //modifica un climber nou//
    }
    @DeleteMapping("/climbers/{id}")
    boolean deleteClimber(@PathVariable Long id) {
        return climberService.delete(id);  //borra un climber//
    }



}