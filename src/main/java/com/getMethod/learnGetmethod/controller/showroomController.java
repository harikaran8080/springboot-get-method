package com.getMethod.learnGetmethod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getMethod.learnGetmethod.entity.Showroom;
import com.getMethod.learnGetmethod.repository.showroomRepository;
import com.getMethod.learnGetmethod.service.showroomService;

@RestController
@RequestMapping("/get")
public class showroomController {
	
	@Autowired
	showroomService showroomService;

	@GetMapping("/mapping")
	public List<Showroom> vechicles() {
		return showroomService.vechicles();
	
		
	}
	
}
