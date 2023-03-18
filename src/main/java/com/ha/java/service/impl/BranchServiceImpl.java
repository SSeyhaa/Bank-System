package com.ha.java.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ha.java.dto.BranchDto;
import com.ha.java.entity.Branch;
import com.ha.java.exception.ApiException;
import com.ha.java.mapper.BranchMapper;
import com.ha.java.repository.BranchRepository;
import com.ha.java.service.BranchService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BranchServiceImpl implements BranchService{

	private final BranchRepository branchRepository;
	
	@Override
	public BranchDto postBranch(BranchDto branchDto) {

		Branch branch = BranchMapper.INSTANCE.toBranch(branchDto);
		
		BranchDto getBranchDto = BranchMapper.INSTANCE.toBranchDto(branchRepository.save(branch)) ;
		
		return getBranchDto;
	}

	@Override
	public BranchDto getBranch(Long id) {

		Branch branch = branchRepository.findById(id)
						.orElseThrow(() -> new ApiException(HttpStatus.NOT_FOUND, String.format("NOT FOUND ID: %d", id)));
		
		BranchDto branchDto = BranchMapper.INSTANCE.toBranchDto(branch);
		
		return branchDto;
	}

	@Override
	public BranchDto putBranch(Long id, BranchDto branchDto) {

		Branch branch = branchRepository.findById(id)
				.orElseThrow(() -> new ApiException(HttpStatus.NOT_FOUND, String.format("NOT FOUND ID: %d", id) ) );
		
		branch.setName(branchDto.getName());
		branch.setAddress(branchDto.getAddress());
		branch.setCity(branchDto.getCity());
		
		return BranchMapper.INSTANCE.toBranchDto(branchRepository.save(branch));
	}

	@Override
	public BranchDto deleteBranch(Long id) {

		BranchDto branchDto = getBranch(id);
		
		if( branchDto != null) {
			branchRepository.deleteById(id);
			return branchDto;
		}
		return null;
	}

}
