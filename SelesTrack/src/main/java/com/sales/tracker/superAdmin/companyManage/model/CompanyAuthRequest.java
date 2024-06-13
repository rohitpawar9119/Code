package com.sales.tracker.superAdmin.companyManage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyAuthRequest {

    private String username;
    private String password;
    
	public String getUsername(String string) {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword(String string) {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    
}