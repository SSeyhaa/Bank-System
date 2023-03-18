package com.ha.java.entity;

import jakarta.annotation.Generated;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id")
	private Long id;
	
	@Nullable
	private String name;
	
	@Nullable
	private String address;
	
	@Nullable
	private String city;
	
}
