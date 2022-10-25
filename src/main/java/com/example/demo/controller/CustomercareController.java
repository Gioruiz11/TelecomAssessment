package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customercare;
import com.example.demo.repo.CustomercareRepo;

@RestController
@RequestMapping("api/customercare")
public class CustomercareController {
	
	@Autowired
	CustomercareRepo CustomercareRepo;
	
	@GetMapping("/getcustomercare") //endpoint
	private List<Customercare> getAllComplaints(){
		return CustomercareRepo.findAll();
	}
	
	
	@PostMapping("/addcustomercare")
	Customercare newUser(@RequestBody Customercare cc) {
		return CustomercareRepo.save(cc);
	}
	
	@DeleteMapping("/delete/{id}")
	Long deleteCustomercare(@PathVariable Long id) {
		CustomercareRepo.deleteById(id);
		return id;
	}

}
