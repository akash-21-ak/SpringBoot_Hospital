package com.akash.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.hospital.dto.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
	
}
