package com.sales.tracker.superAdmin.companyManage.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.companyManage.model.RegisterData;
@Repository
public interface RegisterDataRepo extends CrudRepository<RegisterData ,Integer>{
	Optional<RegisterData> findByEmail(String email);
}
