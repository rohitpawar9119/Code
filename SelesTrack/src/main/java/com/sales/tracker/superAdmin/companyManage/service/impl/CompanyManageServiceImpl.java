package com.sales.tracker.superAdmin.companyManage.service.impl;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.companyManage.exception.CompanyNotFoundException;
import com.sales.tracker.superAdmin.companyManage.model.CompanyManage;
import com.sales.tracker.superAdmin.companyManage.model.RegisterData;
import com.sales.tracker.superAdmin.companyManage.payload.RegisterDto;
import com.sales.tracker.superAdmin.companyManage.repository.CompanyManageRepository;
import com.sales.tracker.superAdmin.companyManage.repository.RegisterDataRepo;
import com.sales.tracker.superAdmin.companyManage.service.CompanyManageService;
import com.sales.tracker.superAdmin.companyManage.util.EmailUtil;
import com.sales.tracker.superAdmin.companyManage.util.OtpUtil;

import jakarta.mail.MessagingException;

@Service
public class CompanyManageServiceImpl implements CompanyManageService {

	@Autowired
	private CompanyManageRepository companyRepository;


	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private RegisterDataRepo redata;
	@Autowired
	  private OtpUtil otpUtil;
	  @Autowired
	  private EmailUtil emailUtil;

//	@Override
//	public String createCompany(CompanyCreateRequest companyRequest) {
//		
//		CompanyManage company = new CompanyManage(
//				companyRequest.getCompanyName(),
//				companyRequest.getCompanySize(),
//				companyRequest.getClass(),
//				companyRequest.getDepartment(),
//				companyRequest.getEmail(),
//				companyRequest.getFirstName(),
//				companyRequest.getIndustry(),
//				companyRequest.getJobTitle(),
//				companyRequest.getLastName(),
//				companyRequest.getStatus(),
//				companyRequest.getSubdomain(),
//				companyRequest.getWebsite(),
//				this.passwordEncoder.encode(companyRequest.getPassword())
//				
//				);
//		
//		 companyRepository.save(company);
//		 return company.getCompanyName();
//	}

	@Override
	public List<CompanyManage> companyInformation(CompanyManage company) {
		List<CompanyManage> getAllCompanyInfo = (List<CompanyManage>) companyRepository.findAll();
		return getAllCompanyInfo;
	}

	@Override
	public CompanyManage getCompanyById(int id) {
		CompanyManage getCompanyById = companyRepository.findById(id);
		if (getCompanyById == null) {
			throw new CompanyNotFoundException("You Entered Wrong Id" + HttpStatus.BAD_REQUEST);
		}
		return getCompanyById;
	}

	@Override
	public CompanyManage editCompany(CompanyManage company) {
		CompanyManage edit = companyRepository.save(company);
		return edit;
	}

	@Override
	public void deleteCompanyById(int id) {
		if (companyRepository.findById(id) == null) {
			throw new CompanyNotFoundException("You Entered Wrong Id" + HttpStatus.BAD_REQUEST);
		}
		companyRepository.deleteById(id);

	}

//	@Override
//	public CompanyManage createCompany(CompanyManage company) {
//		CompanyManage saveCompany=companyRepository.save(company);
//		return saveCompany;
//	}

	public String register(RegisterDto registerDto) {
	    String otp = otpUtil.generateOtp();
	    try {
	      emailUtil.sendOtpEmail(registerDto.getEmail(), otp);
	    } catch (MessagingException e) {
	      throw new RuntimeException("Unable to send otp please try again");
	    }
	    
	    RegisterData user = new RegisterData();
//	    user.setName(registerDto.getName());
	    user.setEmail(registerDto.getEmail());
//	    user.setPassword(registerDto.getPassword());
	    user.setOtp(otp);
	    user.setOtpGeneratedTime(LocalDateTime.now());
	    redata.save(user);
	    return "User registration and otp sent successful";
	  }

	  public String verifyAccount(String email, String otp) {
		  RegisterData user = redata.findByEmail(email)
	        .orElseThrow(() -> new RuntimeException("User not found with this email: " + email));
	    if (user.getOtp().equals(otp) && Duration.between(user.getOtpGeneratedTime(),
	        LocalDateTime.now()).getSeconds() < (5 * 60)) {
	      user.setActive(true);
	      redata.save(user);
	      return "OTP verified you can create your profile";
	    }
	    return "Please regenerate otp and try again";
	  }
	  public String regenerateOtp(String email) {
		  RegisterData user = redata.findByEmail(email)
		        .orElseThrow(() -> new RuntimeException("User not found with this email: " + email));
		    String otp = otpUtil.generateOtp();
		    try {
		      emailUtil.sendOtpEmail(email, otp);
		    } catch (MessagingException e) {
		      throw new RuntimeException("Unable to send otp please try again");
		    }
		    user.setOtp(otp);
		    user.setOtpGeneratedTime(LocalDateTime.now());
		    redata.save(user);
		    return "Email sent... please verify account within 5 minute";
		  }
}
