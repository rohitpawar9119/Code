package com.sales.tracker.superAdmin.planPackageManage.model;

import java.time.LocalDateTime;

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
 * @author suyog
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "st_plan_packages")
public class PlanPackage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int packageId;

	private String name;

	private long packageCost;

	@Column(name = "created")
	@CreationTimestamp
	private LocalDateTime created;

	@Column(name = "updated")
	@UpdateTimestamp
	private LocalDateTime updated;

	private int status;

	private String modules;

	private int userLimit;


	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(long packageCost) {
		this.packageCost = packageCost;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public int getUserLimit() {
		return userLimit;
	}

	public void setUserLimit(int userLimit) {
		this.userLimit = userLimit;
	}

}
