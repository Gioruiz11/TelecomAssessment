package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customercare")
public class Customercare {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private String complaintDescription;
	@Column(nullable = false)
	private Long userId;
	private String statusOfComplaint;
	
	public Customercare() {
		super();
	}

	public Customercare(Long id, String complaintDescription, Long userId, String statusOfComplaint) {
		super();
		this.id = id;
		this.complaintDescription = complaintDescription;
		this.userId = userId;
		this.statusOfComplaint = statusOfComplaint;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatusOfComplaint() {
		return statusOfComplaint;
	}

	public void setStatusOfComplaint(String statusOfComplaint) {
		this.statusOfComplaint = statusOfComplaint;
	}
	
	
	
	
	
	
	
	
	
	

}
