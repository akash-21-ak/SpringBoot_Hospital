package com.akash.hospital.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akash.hospital.dto.Admin;
import com.akash.hospital.repo.AdminRepo;

@Repository
public class AdminDao {
	@Autowired
	private AdminRepo adminRepo;

	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	public Admin getAdmin(int id) {
		Optional<Admin> optional = adminRepo.findById(id);
		if (optional.isPresent())
			return optional.get();
		
		else 
			return null;
	}
	
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	public Admin deleteAdmin(Admin admin) {
		adminRepo.delete(admin);
		return admin ;
	}
	
}
