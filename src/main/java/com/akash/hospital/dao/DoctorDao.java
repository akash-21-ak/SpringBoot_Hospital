package com.akash.hospital.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akash.hospital.dto.Doctor;
import com.akash.hospital.repo.DoctorRepo;

@Repository
public class DoctorDao {
	@Autowired
	private DoctorRepo doctorRepo;

	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	public Doctor getDoctor(int id) {
		Optional<Doctor> optional = doctorRepo.findById(id);
		if (optional.isEmpty())
			return null;
		else
			return optional.get();
	}

	public Doctor updateDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
		return doctor;
	}

	public Doctor deleteDoctor(Doctor doctor) {
		doctorRepo.delete(doctor);
		return doctor;
	}
}
