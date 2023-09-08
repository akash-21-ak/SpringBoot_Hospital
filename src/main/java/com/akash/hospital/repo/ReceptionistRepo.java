package com.akash.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.hospital.dto.Receptionist;

public interface ReceptionistRepo extends JpaRepository<Receptionist, Integer>{
	
}
