package com.akash.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.hospital.dao.AdminDao;
import com.akash.hospital.dto.Receptionist;
import com.akash.hospital.services.ReceptionistService;
import com.akash.hospital.util.ResponseStructure;

@RestController
public class ReceptionistController {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private ReceptionistService receptionistService;

	@PostMapping("savereceptionist")
	public ResponseStructure<Receptionist> saveReceptionist(Receptionist receptionist) {
		return receptionistService.saveReceptionist(receptionist);
	}
}
