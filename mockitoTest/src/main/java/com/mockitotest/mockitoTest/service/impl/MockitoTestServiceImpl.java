package com.mockitotest.mockitoTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockitotest.mockitoTest.service.MockitoTestService;
import com.mockitotest.mockitoTest.util.MockitoUtil;

@Service
public class MockitoTestServiceImpl implements MockitoTestService {

	//@Autowired
	private MockitoUtil util;
	
	public MockitoTestServiceImpl(){
		util = new MockitoUtil();
	}
	
	
	@Override
	public String RetornaLetra() {

		String retorno = util.getLetra();
		return retorno;
	}

}
