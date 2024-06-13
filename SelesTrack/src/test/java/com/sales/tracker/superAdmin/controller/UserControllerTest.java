//package com.sales.tracker.superAdmin.controller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.event.EventListener;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.sales.tracker.controller.UserController;
//import com.sales.tracker.entity.AuthRequest;
//import com.sales.tracker.repository.UserInfoRepository;
//import com.sales.tracker.service.JwtService;
//import com.sales.tracker.service.UserInfoService;
//import com.sales.tracker.superAdmin.departmentManager.model.DepartmentManager;
//import com.sales.tracker.superAdmin.departmentManager.service.DepartmentManagerService;
//
//
//
//
//public class UserControllerTest {
//	
//	private static final String END_POINT_PATH = "/department";
//
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	
//	@Autowired
//	private String authenticationManager;
//	
//	@MockBean
//	private JwtService jwtService;
//	
//	@MockBean
//	private DepartmentManagerService service;
//	
//	
//	
//	@Autowired
//	UserController userController;
//	
//	@MockBean
//	private UserInfoService userInfoService;
//	
//	@Autowired
//	 UserInfoRepository repository;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	public String  welcomeTest() {
//		
//		return "Welcome this endpoint is not secure";
//	}
//	
////	@Test
////	@EventListener
////	public void authenticateAndGetTokenTest(AuthRequest authRequest)throws Exception {
////		//log.info("inside token generation");
////		
////		
////		Mockito.when(jwtService.generateToken(authRequest.getUsername(null))).thenReturn(authenticationManager);
////
////	    mockMvc.perform(get("/generateToken"))
////	        .andExpect(status().isOk())
////	        .andExpect(jsonPath("$", Matchers.hasSize(1)))
////	        .andExpect(jsonPath("$[0].firstName", Matchers.is("Suyog")));
////	}
//	
////	@Test
////	public void testGenerateToken() {
////		AuthRequest auth = new AuthRequest();
////		auth.setUsername("ram");
////		auth.setPassword("1234");
////		
////		
////		
////	}
//	
//	  @Test
//	    public void testAddShouldReturn400BadRequest() throws Exception {
//	    	
//	    	String requestURI = END_POINT_PATH + "/addDepartment";
//	        DepartmentManager newUser = new DepartmentManager(requestURI, null, null, 0).name("");
//	 
//	       DepartmentManager ss= service.addDepartment(newUser);
//	        String requestBody = objectMapper.writeValueAsString(ss);
//	 
//	        mockMvc.perform(post(requestURI)
//	        		.contentType("application/json")
//	                .content(requestBody))
//	                .andExpect(status().isBadRequest())
//	                .andDo(print())
//	        ;
//	    }
//}
