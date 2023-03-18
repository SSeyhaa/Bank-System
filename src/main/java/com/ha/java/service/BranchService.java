package com.ha.java.service;

import com.ha.java.dto.BranchDto;

public interface BranchService {

	BranchDto postBranch(BranchDto branchDto);
	
	BranchDto getBranch(Long id);
	
	BranchDto putBranch(Long id, BranchDto branchDto);
	
	BranchDto deleteBranch(Long id);
	
}
