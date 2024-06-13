package com.sales.tracker.companyAdmin.teamMemberManage.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author saurabh
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="st_team_member")
public class TeamMemberManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String email;
	
	private String password;
	
	private String phoneNo;
	
	private int CompanyId;
	
	private int workspaceId;
	
	private String firstname;
	
	private String lastname;
	
	private int status;
	
	@CreationTimestamp
	@Column(name = "created", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp created;
	@UpdateTimestamp
	@Column(name = "updated", columnDefinition = "TIMESTAMP")
	private Timestamp updated;
	
	private String roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getCompanyId() {
		return CompanyId;
	}

	public void setCompanyId(int companyId) {
		this.CompanyId = companyId;
	}

	public int getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(int workspaceId) {
		this.workspaceId = workspaceId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public TeamMemberManagement(String username, String email, String password, String phoneNo, int companyId,
			int workspaceId, String firstname, String lastname, int status, String roles) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.CompanyId = companyId;
		this.workspaceId = workspaceId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.status = status;

		this.roles = roles;
	}
}
