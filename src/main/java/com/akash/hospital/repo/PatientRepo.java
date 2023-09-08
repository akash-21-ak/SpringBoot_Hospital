package com.akash.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.hospital.dto.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
