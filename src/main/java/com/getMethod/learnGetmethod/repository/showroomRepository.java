package com.getMethod.learnGetmethod.repository;
  
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getMethod.learnGetmethod.entity.Showroom;

@Repository
public interface showroomRepository extends JpaRepository<Showroom, Integer>{


	}

	


