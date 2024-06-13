package com.sales.tracker.superAdmin.departmentManager.model;

import java.sql.Timestamp;
import java.util.Objects;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "st_department")
public class DepartmentManager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank
	private String name;
	@CurrentTimestamp
	@Column(name = "created", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp created;
	@UpdateTimestamp
	@Column(name = "updated", columnDefinition = "TIMESTAMP")
	private Timestamp updated;

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

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpload() {
		return updated;
	}

	public void setUpload(Timestamp upload) {
		this.updated = upload;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public DepartmentManager(String name, Timestamp created, Timestamp upload, int status) {
		super();
		this.name = name;
		this.created = created;
		this.updated = upload;
		this.status = status;
	}
	
	

	public DepartmentManager name(String name) {
		this.name=name;
		return this.name(getName());
	}

//	public static DepartmentManager builder() {
//		
//		return null;
//	}
//
//	public DepartmentManager build() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Builder
	public static
	Builder builder() {
		return builder();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, status, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentManager other = (DepartmentManager) obj;
		return Objects.equals(name, other.name) && Objects.equals(status, other.getName())
				&& Objects.equals(id, other.id) && Objects.equals(id, other.name)
				&& Objects.equals(name, other.name);
	}

	public DepartmentManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
