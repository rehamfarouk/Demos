package com.example.champion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.champion.model.Participant;
import com.example.champion.repository.ParticipantRepository;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantRepository participantRepository;

	public List<Participant> findAll() {

		List<Participant> participants = new ArrayList<Participant>();

		participantRepository.findAll().forEach(e -> participants.add(e));

		return participants;
	}

	public Long count() {

		return participantRepository.count();
	}

	public void deleteById(Long userId) {

		participantRepository.deleteById(userId);
	}

}
