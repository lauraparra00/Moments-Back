package com.moments.up.services;

import com.moments.up.models.Climber;

import java.lang.ref.Reference;
import java.util.List;


public interface IClimberService {


    List<Climber> findAll();

    Climber findById(Long id);

    Climber create(Climber newClimber);

    Climber update(Long id, Climber updatedClimber);

    boolean delete(Long id);

    List<Climber> search(String search);

}
