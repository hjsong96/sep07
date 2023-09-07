package com.hadine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadine.entity.Test;
import com.hadine.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;
	
	public List<Test> list() {
		return testRepository.findAll();
	}

}
