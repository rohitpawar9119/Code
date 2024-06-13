//package com.sales.superAdmin.planPackageManage.payload;
//
//import java.time.LocalDateTime;
//
//
//import org.hibernate.annotations.UpdateTimestamp;
//
//import jakarta.persistence.Column;
//
//
//public class PlanDto {
//
//	private int packageId;
//
//	private String name;
//
//	private long packageCost;
//
//	@Column(name = "updated")
//	@UpdateTimestamp
//	private LocalDateTime updated;
//
//	private int status;
//
//	private String modules;
//
//	private int userLimit;
//
//	public int getPackageId() {
//		return packageId;
//	}
//
//	public void setPackageId(int packageId) {
//		this.packageId = packageId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public long getPackageCost() {
//		return packageCost;
//	}
//
//	public void setPackageCost(long packageCost) {
//		this.packageCost = packageCost;
//	}
//
//	public LocalDateTime getUpdated() {
//		return updated;
//	}
//
//	public void setUpdated(LocalDateTime updated) {
//		this.updated = updated;
//	}
//
//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}
//
//	public String getModules() {
//		return modules;
//	}
//
//	public void setModules(String modules) {
//		this.modules = modules;
//	}
//
//	public int getUserLimit() {
//		return userLimit;
//	}
//
//	public void setUserLimit(int userLimit) {
//		this.userLimit = userLimit;
//	}
//
//	public PlanDto(int packageId, String name, long packageCost, LocalDateTime updated, int status, String modules,
//			int userLimit) {
//		super();
//		this.packageId = packageId;
//		this.name = name;
//		this.packageCost = packageCost;
//		this.updated = updated;
//		this.status = status;
//		this.modules = modules;
//		this.userLimit = userLimit;
//	}
//
//	public PlanDto() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	
//}
