package com.sales.tracker.superAdmin.companyManage.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author suyog
 *
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "st_company")
@SecondaryTable(name = "st_organization")
//, pkJoinColumns = @PrimaryKeyJoinColumn(name = "companyId_id")
public class CompanyManage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="company_id")
	private int companyId;
	
	private String username;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="job_title")
	private String jobTitle;

	private int department;

	private String email;

	private String password;

	@Column(name = "company_name", table = "st_organization")
	private String companyName;
	@Column(name = "website", table = "st_organization")
	private String website;
	@Column(name = "subdomain", table = "st_organization")
	private String subdomain;
	@Column(name = "industry", table = "st_organization")
	private int industry;
	@Column(name = "company_size", table = "st_organization")
	private int companySize;
	
	@CreationTimestamp
	@Column(name="created_date")
	private  LocalDateTime createdDate;
	
	private String roles;


	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	

		
	
}
