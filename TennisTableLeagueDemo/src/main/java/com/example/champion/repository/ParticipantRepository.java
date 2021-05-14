package com.example.champion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.champion.model.Participant;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}