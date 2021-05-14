package com.example.champion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.champion.model.Participant;
import com.example.champion.service.ParticipantService;

@RestController
public class ParticipantController {

	@Autowired
	private ParticipantService ParticipantService;

	@GetMapping("/Participants")
	public List<Participant> allParticipants() {
		return ParticipantService.findAll();
	}

	@GetMapping("/Participants/count")
	public Long count() {

		return ParticipantService.count();
	}

	@DeleteMapping("/Participants/{id}")
	public void delete(@PathVariable String id) {

		Long userId = Long.parseLong(id);
		ParticipantService.deleteById(userId);
	}

}
