package com.sales.tracker.controller;

import com.sales.tracker.entity.AuthRequest;
import com.sales.tracker.entity.UserInfo;
import com.sales.tracker.service.JwtService;
import com.sales.tracker.service.UserInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserInfoService service;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationManager authenticationManager;
	
//	@Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
	
      String className="UserController";
	@GetMapping("/welcome")
	
	public String welcome() {
		log.info("welcome to"+className);
		log.error("the error in "+className+" /welcome");
		return "Welcome this endpoint is not secure";
	}

	@GetMapping("/message")
	public String message() {
		return "this message from user controller message method ";
	}

	@PostMapping("/addNewUser")
	public String addNewUser(@RequestBody UserInfo userInfo) {

		log.info("welcome to"+className+" /addNewUser");
		log.error("the error in "+className+ " /addNewUser");
		return service.addUser(userInfo);
	}

	@GetMapping("/user/userProfile")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String userProfile() {

		log.info("welcome to"+className+" /user/userProfile");
		log.error("the error in "+className+ " /user/userProfile");
		return "Welcome to User Profile";
	}

	@GetMapping("/admin/adminProfile")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminProfile() {

		log.info("welcome to"+className+" /admin/adminProfile");
		log.error("the error in "+className+ " /admin/adminProfile");
		return "Welcome to Admin Profile";
	}

	@PostMapping("/generateToken")
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
		//log.info("inside token generation");
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(className), authRequest.getPassword(className)));
		if (authentication.isAuthenticated()) {
			log.info("welcome to"+className);
			log.info("token generated");
			return jwtService.generateToken(authRequest.getUsername(className));
		} else {

		
			log.error("the error in "+className+ " /generateToken");
			throw new UsernameNotFoundException("invalid user request !");
		}
	}

}