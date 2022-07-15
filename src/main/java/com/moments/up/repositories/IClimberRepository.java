package com.moments.up.repositories;

import com.moments.up.models.Climber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IClimberRepository extends JpaRepository<Climber, Long> {


//  Optional<Climber> findById(Long id);

//    List<Climber> findAll();
}
