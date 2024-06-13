package com.sales.tracker.superAdmin.industryManage.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;
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
 * @author mahesh
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "st_industry")
public class IndustryManage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@CurrentTimestamp
	@Column(name = "created")
	private LocalDateTime created;

	@Column(name = "updated")
	@UpdateTimestamp
	private LocalDateTime update;

	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdate() {
		return update;
	}

	public void setUpdate(LocalDateTime update) {
		this.update = update;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

//	@Temporal(TemporalType.TIMESTAMP)

//	@PrePersist
//	public void onCreate() {
//		createTime=LocalDateTime.now();
//	}

//	@PreUpdate
//	private void onUpdate() {
//		updateTime = LocalDateTime.now();
//
//	}

}
