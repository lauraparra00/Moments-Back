package com.moments.up.repositories;

import com.moments.up.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILikeRepository extends JpaRepository<Like, Long> {

 //   @Query("select 1 from like 1 where 1.climber.id = :id")
  List<Like> getByClimberId(@Param("id") Long id);

}
