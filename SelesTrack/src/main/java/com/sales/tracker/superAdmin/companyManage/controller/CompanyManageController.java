package com.sales.tracker.superAdmin.companyManage.controller;

import java.util.List;

import com.sales.tracker.superAdmin.companyManage.model.CompanyAuthRequest;
import com.sales.tracker.superAdmin.companyManage.model.CompanyManage;
import com.sales.tracker.superAdmin.companyManage.payload.RegisterDto;
import com.sales.tracker.superAdmin.companyManage.service.CompanyManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.tracker.superAdmin.companyManage.service.jwt.CompanyJwtService;
import com.sales.tracker.superAdmin.companyManage.service.jwt.CompanyManageJwtService;

/**
 * @author suyog
 *
 */
@RestController
@RequestMapping("/company")
public class CompanyManageController {
	private static final Logger log = LoggerFactory.getLogger(CompanyManageController.class);
    String className="CompanyManageController";
	@Autowired
	private CompanyManageService companyService;

	@Autowired
	private CompanyManageJwtService companyJwtService;

	@Autowired
	private CompanyJwtService jwtService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/msg")
	public String getCompany() {
		log.info("welcome to"+className+" /msg");
		log.error("the error in "+className+ " /msg");
		return "welcome to company !!! ";
	}

//	@PostMapping("/createCompany")
//	public String createCompany(@RequestBody CompanyDto companyRequest) {
//		String create = companyService.createCompany(companyRequest);
//		return create;
//	}

	@PostMapping("/login")
	public String authenticateAndGetToken(@RequestBody CompanyAuthRequest authRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(className), authRequest.getPassword(className)));
		if (authentication.isAuthenticated()) {
			log.info("welcome to"+className+" /login");
			
			return jwtService.generateToken(authRequest.getUsername(className));
		} else {
			log.error("the error in "+className+ " /login");
			throw new UsernameNotFoundException("invalid user request !");
		}
	}

	@PostMapping("/createCompany")
	public String createCompany(@RequestBody CompanyManage company) {
		String create = companyJwtService.addUser(company);
		log.info("welcome to"+className+" /createCompany");
		log.error("the error in "+className+ " /createCompany");
		return create;
	}

	@PutMapping("/editCompany")
	public CompanyManage editCompany(@RequestBody CompanyManage company) {
		CompanyManage edit = companyService.editCompany(company);
		log.info("welcome to"+className+" /editCompany");
		log.error("the error in "+className+ " /editCompany");
		return edit;
	}

	@GetMapping("/Information")
	public List<CompanyManage> companyInformation(CompanyManage company) {
		List<CompanyManage> getAll = companyService.companyInformation(company);
		log.info("welcome to"+className+" /Information");
		log.error("the error in "+className+ " /Information");
		return getAll;
	}

	@GetMapping("/Information/{id}")
	public CompanyManage getCompanyById(@PathVariable("id") int id) {
		CompanyManage getCompanyById = companyService.getCompanyById(id);
		log.info("welcome to"+className+"/Information/{id}");
		log.error("the error in "+className+ " /Information/{id}");
		return getCompanyById;
	}

	@DeleteMapping("/deleteCompany/{id}")
	public void deleteCompanyById(@PathVariable("id") int id) {
		companyService.deleteCompanyById(id);
		log.info("welcome to"+className+" /deleteCompany/{id}");
		log.error("the error in "+className+ " /deleteCompany/{id}");

	}
	
	 @PostMapping("/register")
	  public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
	    return new ResponseEntity<>(companyService.register(registerDto), HttpStatus.OK);
	  }

	  @PutMapping("/verify-account")
	  public ResponseEntity<String> verifyAccount(@RequestParam String email,
	      @RequestParam String otp) {
	    return new ResponseEntity<>(companyService.verifyAccount(email, otp), HttpStatus.OK);
	  }
	  @PutMapping("/regenerate-otp")
	  public ResponseEntity<String> regenerateOtp(@RequestParam String email) {
	    return new ResponseEntity<>(companyService.regenerateOtp(email), HttpStatus.OK);
	  }
}
