package com.sales.tracker.superAdmin.companyManage.service.jwt;





import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sales.tracker.superAdmin.companyManage.model.CompanyManage;
import com.sales.tracker.superAdmin.companyManage.model.RegisterData;
import com.sales.tracker.superAdmin.companyManage.payload.RegisterDto;
import com.sales.tracker.superAdmin.companyManage.repository.CompanyManageRepository;
import com.sales.tracker.superAdmin.companyManage.repository.RegisterDataRepo;
import com.sales.tracker.superAdmin.companyManage.util.EmailUtil;
import com.sales.tracker.superAdmin.companyManage.util.OtpUtil;

import jakarta.mail.MessagingException;

@Service
@Qualifier
public class CompanyManageJwtService implements UserDetailsService{

    @Autowired
    private CompanyManageRepository repository;

    @Autowired
    private RegisterDataRepo redarepo;
    @Autowired
    private PasswordEncoder encoder;
	@Autowired
	  private OtpUtil otpUtil;
	  @Autowired
	  private EmailUtil emailUtil;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    	 Optional<CompanyManage> userDetail = repository.findByUsername(username);

        // Converting userDetail to UserDetails
        return userDetail.map(CompanyManageDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }

    public String addUser(CompanyManage company) {
        RegisterData user = redarepo.findByEmail(company.getEmail())
    	        .orElseThrow(() -> new RuntimeException("User not found with this email: " +  company.getEmail()));
             if (!user.isActive()) {
        		  return "your account is not verified";
          }

        company.setPassword(encoder.encode(company.getPassword()));
        repository.save(company);
        
//        try {
//  	      emailUtil.sendRegisterMassegeEmail(company.getEmail());
//  	    } catch (MessagingException e) {
//  	      throw new RuntimeException("Unable to send otp please try again");
//  	    }
        return "User Added Successfully";
    }
//    !loginDto.getPassword().equals(user.getPassword())
//    company.getEmail()==user.getEmail()
}
