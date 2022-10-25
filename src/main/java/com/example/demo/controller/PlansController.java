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

import com.example.demo.entity.Plans;
import com.example.demo.repo.PlansRepo;

@RestController
@RequestMapping("api/plans")
public class PlansController {

	@Autowired
	PlansRepo plansRepo;
	
	@GetMapping("/getplans") // Endpoint
	private List<Plans> getAllPlans(){
		return plansRepo.findAll();
	}
	
	@PostMapping("/addplans") // Endpoint
	Plans addPlan(@RequestBody Plans plan) {
		return plansRepo.save(plan);
	}
	
	@DeleteMapping("/delete/{id}")
	Long deletePlan(@PathVariable Long id) {
		plansRepo.deleteById(id);
		return id;
	}
}
