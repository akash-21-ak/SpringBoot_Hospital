package com.akash.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akash.hospital.dao.AdminDao;
import com.akash.hospital.dto.Admin;
import com.akash.hospital.services.AdminService;
import com.akash.hospital.util.ResponseStructure;

@RestController
public class AdminController {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	AdminService adminService;
	
	@PostMapping("saveadmin")
	public ResponseStructure<Admin> saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	
	@GetMapping("getadmin")
	public ResponseStructure<Admin> getAdmin(@RequestParam int id) {
		return adminService.getAdmin(id);
	}
	
	@PutMapping("updateadmin")
	public ResponseStructure<Admin> updateAdmin(@RequestBody Admin admin, @RequestParam int id) {
		return adminService.updateAdmin(admin, id);
	}
	
	@DeleteMapping("deleteadmin")
	public ResponseStructure<Admin> deleteAdmin(@RequestParam int id) {
		return adminService.deleteAdmin( id);
	}	

}
