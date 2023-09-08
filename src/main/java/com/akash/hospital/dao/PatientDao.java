package com.akash.hospital.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akash.hospital.dto.Patient;
import com.akash.hospital.repo.PatientRepo;

@Repository
public class PatientDao {
	@Autowired
	private PatientRepo patientRepo;

	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

	public Patient getPatient(int id) {
		Optional<Patient> optional = patientRepo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		else {
			return optional.get();
		}
	}

	public Patient updatePatient(Patient patient) {
		return patientRepo.save(patient);
	}

	public Patient deletePatient(Patient patient) {
		patientRepo.delete(patient);
		return patient;
	}
}
