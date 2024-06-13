package com.sales.tracker.superAdmin.companyManage.repository;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.companyManage.model.CompanyManage;
import com.sales.tracker.superAdmin.companyManage.payload.CompanyDto;
import com.sales.tracker.superAdmin.companyManage.payload.RegisterDto;

@Repository
public interface CompanyManageRepository extends CrudRepository<CompanyManage, Integer> {

	public CompanyManage findById(int id);

	public CompanyManage deleteById(int id);

	public Optional<CompanyManage> findByUsername(String username);
	
	Optional<CompanyManage> findByEmail(String email);

}
