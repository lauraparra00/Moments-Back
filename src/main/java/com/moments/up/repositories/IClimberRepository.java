package com.moments.up.repositories;

import com.moments.up.models.Climber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IClimberRepository extends JpaRepository<Climber, Long> {

    @Query("select c from Climber c where c.description like %:search% or c.title like %:search%")
    List <Climber> findByDescriptionOrTitleContaining(@Param("search") String search);


}
