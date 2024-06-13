package com.sales.tracker.companyAdmin.clientManage.service;

import java.util.List;

import com.sales.tracker.companyAdmin.clientManage.model.ClientManage;
/**
 * @author mahesh
 *
 */


public interface ClientManageService {

	public ClientManage createCompany(ClientManage company);

	public List<ClientManage> companyInformation(ClientManage company);

	public ClientManage editCompany(ClientManage company);

	public ClientManage getCompanyById(int id);

	public void deleteCompanyById(int id);

}
