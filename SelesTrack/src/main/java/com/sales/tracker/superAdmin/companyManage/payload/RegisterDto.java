package com.sales.tracker.superAdmin.companyManage.payload;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class RegisterDto {

  private String name;
  private String email;
  private String password;
  private boolean active;
  private String otp;
  private LocalDateTime otpGeneratedTime;
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public String getOtp() {
	return otp;
}
public void setOtp(String otp) {
	this.otp = otp;
}
public LocalDateTime getOtpGeneratedTime() {
	return otpGeneratedTime;
}
public void setOtpGeneratedTime(LocalDateTime otpGeneratedTime) {
	this.otpGeneratedTime = otpGeneratedTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
  

}
