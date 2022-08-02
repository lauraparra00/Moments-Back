package com.moments.up.services;

import com.moments.up.models.Climber;
import com.moments.up.repositories.IClimberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ClimberService implements IClimberService{
    private IClimberRepository climberRepository;

    public ClimberService(IClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }

        @Override
        public List<Climber> findAll() {
            return climberRepository.findAll();
        }

        @Override
        public Climber findById(Long id) {
            return climberRepository.findById(id).get();
        }

        @Override
        public Climber create(Climber newClimber) {
            return climberRepository.save(newClimber);
        }

        @Override
        public Climber update(Long id, Climber updatedClimber) {
            Climber climber = climberRepository.findById(id).get();
            if(climber == null) return null;
            climber.setTitle(updatedClimber.getTitle());
            climber.setDescription(updatedClimber.getDescription());
            climber.setUrl(updatedClimber.getUrl());
            return climberRepository.save(climber);
        }

        @Override
        public boolean delete(Long id) {
            Climber climber = climberRepository.findById(id).get();
            if(climber == null) return false;
            climberRepository.delete(climber);
            return true;
        }

        @Override
        public List<Climber> search(String search) {
            var searchCollection = this.climberRepository.findByDescriptionOrTitleContaining(search);
            return searchCollection;
        }
    }
