package com.akash.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.hospital.dto.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{
	
}