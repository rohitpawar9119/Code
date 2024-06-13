package com.sales.tracker.superAdmin.companyManage.service;

import java.util.List;


import com.sales.tracker.superAdmin.companyManage.model.CompanyManage;
import com.sales.tracker.superAdmin.companyManage.payload.RegisterDto;
/**
 * @author suyog
 *
 */
public interface CompanyManageService {

//	public CompanyManage createCompany(CompanyManage company);
	

	public List<CompanyManage> companyInformation(CompanyManage company);
	
	public CompanyManage getCompanyById(int id);
	
	public CompanyManage editCompany(CompanyManage company);
	
	public void deleteCompanyById(int id);

	public String verifyAccount(String email, String otp);
	
	public String register(RegisterDto registerDto);

	public String regenerateOtp(String email);

//	public String createCompany(CompanyDto companydto);

	
}
