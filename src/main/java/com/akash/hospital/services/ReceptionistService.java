package com.akash.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.akash.hospital.dao.ReceptionistDao;
import com.akash.hospital.dto.Receptionist;
import com.akash.hospital.util.ResponseStructure;

@Service
public class ReceptionistService {
	@Autowired
	private ReceptionistDao receptionistDao;
	ResponseStructure<Receptionist> responseStructure = new ResponseStructure<>();
	
	public ResponseStructure<Receptionist> saveReceptionist(Receptionist receptionist) {
		Receptionist receptionist2 = receptionistDao.saveReceptionist(receptionist);
		responseStructure.setData(receptionist2);
		
		if(receptionist2 == null) {
			responseStructure.setMessage("Invalid Transaction");
			responseStructure.setStatus(HttpStatus.NOT_IMPLEMENTED.value());
		}
		else {
			responseStructure.setMessage("Saved Successfully...");
			responseStructure.setStatus(HttpStatus.CREATED.value());
		}
		return responseStructure;
	}
}
