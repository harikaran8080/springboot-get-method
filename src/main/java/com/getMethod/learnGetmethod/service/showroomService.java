package com.getMethod.learnGetmethod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getMethod.learnGetmethod.entity.Showroom;
import com.getMethod.learnGetmethod.repository.showroomRepository;

@Service
public class showroomService {
	@Autowired
	showroomRepository showroomRepository;

	public List<Showroom> vechicles() {
		return showroomRepository.findAll();
		
	
	}
	

}
