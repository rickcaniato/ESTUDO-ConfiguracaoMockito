package com.mockitotest.mockitoTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mockitotest.mockitoTest.service.MockitoTestService;
import com.mockitotest.mockitoTest.service.impl.MockitoTestServiceImpl;
import com.mockitotest.mockitoTest.util.MockitoUtil;

@SpringBootTest
public class MockitoTestApplicationTests {

	@Mock
	MockitoUtil util;

	@InjectMocks
	private MockitoTestService service = new MockitoTestServiceImpl();

	@BeforeEach
	void setMockOutput() {
		when(util.getLetra()).thenReturn("B");
	}

	@Test
	public void contextLoads() {
		//when(util.getLetra()).thenReturn("B");

		assertEquals("B", service.RetornaLetra());
	}

}
