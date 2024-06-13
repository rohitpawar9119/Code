package com.sales.tracker.superAdmin.companyManage.payload;

import java.time.LocalDateTime;


public class CompanyDto {

	private String firstName;

	private String lastName;

	private String jobTitle;

	private int department;

	private String email;

	private String password;

	private String companyName;

	private String website;

	private String subdomain;

	private int industry;

	private int companySize;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public int getIndustry() {
		return industry;
	}

	public void setIndustry(int industry) {
		this.industry = industry;
	}

	public int getCompanySize() {
		return companySize;
	}

	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	private LocalDateTime createdDate;

	private int status;

	

	public CompanyDto(String firstName, String lastName, String jobTitle, int department, String email,
			String password, String companyName, String website, String subdomain, int industry, int companySize,
			LocalDateTime createdDate, int status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.email = email;
		this.password = password;
		this.companyName = companyName;
		this.website = website;
		this.subdomain = subdomain;
		this.industry = industry;
		this.companySize = companySize;
		this.createdDate = createdDate;
		this.status = status;
	}

	@Override
	public String toString() {
		return "CompanyDto [firstName=" + firstName + ", lastName=" + lastName + ", jobTitle=" + jobTitle
				+ ", department=" + department + ", email=" + email + ", password=" + password + ", companyName="
				+ companyName + ", website=" + website + ", subdomain=" + subdomain + ", industry=" + industry
				+ ", companySize=" + companySize + ", createdDate=" + createdDate + ", status=" + status + "]";
	}

	
	
	
	
	
}
