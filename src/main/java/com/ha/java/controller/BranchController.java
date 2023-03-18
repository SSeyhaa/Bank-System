package com.ha.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ha.java.dto.BranchDto;
import com.ha.java.service.BranchService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("branch")
@AllArgsConstructor
public class BranchController {

	private final BranchService branchService;
	
	
	@PostMapping
	public ResponseEntity<BranchDto> postBranch(@RequestBody BranchDto branchDto){
		
		return new ResponseEntity<BranchDto>(branchService.postBranch(branchDto), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<BranchDto> getBranch(@PathVariable Long id){
		
		return new ResponseEntity<BranchDto>(branchService.getBranch(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<BranchDto> putBranch(@PathVariable("id") Long branchId, @RequestBody BranchDto branchDto){
		
		return new ResponseEntity<BranchDto>(branchService.putBranch(branchId, branchDto), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<BranchDto> deleteBranch(@PathVariable Long id){
		
		return new ResponseEntity<BranchDto>(branchService.deleteBranch(id), HttpStatus.OK);
	}
	
	
	
}
