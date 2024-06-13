package com.sales.tracker.superAdmin.companySizeManage.repository;

import org.springframework.data.repository.CrudRepository;

import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel_S;

public interface CompanySizeRepository_S extends CrudRepository<CompanySizeModel_S, Integer> {

		public CompanySizeModel_S findById(int id);

		public CompanySizeModel_S deleteById(int id);

	}


