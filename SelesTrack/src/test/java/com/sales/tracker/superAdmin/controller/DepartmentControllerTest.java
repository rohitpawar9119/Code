package com.sales.tracker.superAdmin.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales.tracker.superAdmin.departmentManager.controller.DepartmentController;
import com.sales.tracker.superAdmin.departmentManager.model.DepartmentManager;
import com.sales.tracker.superAdmin.departmentManager.service.DepartmentManagerService;
import com.sales.tracker.superAdmin.departmentManager.service.impl.DepartmentManagerServiceImpl;

import lombok.Builder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Builder
public class DepartmentControllerTest {

	@LocalServerPort
	private int port;

	
	
	private String baseUrl = "http://localhost";

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	@Autowired
	DepartmentManagerService departmentService;
	
	@Autowired private ObjectMapper objectMapper;

	@Before(value = "insid before")
	public void setup() {
		System.out.println("inside before 2");
		this.mockMvc = MockMvcBuilders.standaloneSetup(DepartmentController.class).build();
	}

	
	@Test
	public void addDepartmentTest() throws Exception {
		System.out.println("inside add department test case");
		
		
		DepartmentManager add=departmentService.addDepartment(null);

		String requestBody = objectMapper.writeValueAsString(add);
		
		System.out.println("inside add department test case 2");
		mockMvc.perform( MockMvcRequestBuilders.post("/department/addDepartment")
				.contentType("application/json")
				.content(asJsonString(add))
				.accept("application/json"))
		        .andDo(print())
				.andExpectAll();
		
		System.out.println("end of add department test case");

	}

	private byte[] asJsonString(DepartmentManager add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void test_JUnit() {
		System.out.println("This is the testcase in this class");
		String str1 = "This is the testcase in this class";
		assertEquals("This is the testcase in this class", str1);
	}

	private void assertEquals(String string, String str1) {
		// TODO Auto-generated method stub

	}
	

	

}
