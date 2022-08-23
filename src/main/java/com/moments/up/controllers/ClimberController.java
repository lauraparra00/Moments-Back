package com.moments.up.controllers;

import com.moments.up.models.Climber;
import com.moments.up.services.IClimberService;
import com.moments.up.services.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/climbers")
    ResponseEntity<List<Climber>> getAll() {
        return new ResponseEntity<>(this.climberService.findAll(),HttpStatus.OK); //torna tots els climbers
    }

    @GetMapping("/climbers/{id}")
    ResponseEntity<Climber> getById(@PathVariable Long id) {
         Climber climber = climberService.findById(id);

        return new ResponseEntity<>(climber, HttpStatus.OK); //ens retorna un climber//
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

    @GetMapping(value = "/climbers", params = "search")
    List <Climber> getSearch(@RequestParam String search) {
        return climberService.search(search); // quan posem paraula al imput ens retorni la paraula
    }
}


