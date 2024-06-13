package com.sales.tracker.companyAdmin.clientManage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.tracker.companyAdmin.clientManage.model.ClientManage;
@Repository
public interface ClientManageRepository extends CrudRepository<ClientManage, Integer> {

	public ClientManage findById(int id);

	public ClientManage deleteById(int id);
}
