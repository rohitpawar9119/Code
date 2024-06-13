package com.sales.tracker.superAdmin.companySizeManage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.sales.tracker.superAdmin.companySizeManage.model.CompanySizeModel;
@Repository
@EnableMongoRepositories
public interface CompanySizeRepository extends MongoRepository<CompanySizeModel, Integer> {

	public CompanySizeModel findById(int id);

	public CompanySizeModel deleteById(int id);

}

