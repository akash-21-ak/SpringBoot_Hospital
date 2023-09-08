package com.akash.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akash.hospital.dto.Receptionist;
import com.akash.hospital.repo.ReceptionistRepo;

@Repository
public class ReceptionistDao {
	@Autowired
	private ReceptionistRepo receptionistRepo;

	public Receptionist saveReceptionist(Receptionist receptionist) {
		return receptionistRepo.save(receptionist);
	}

}
