package com.sales.tracker.companyAdmin.clientManage.service.impl;

import java.util.List;

import com.sales.tracker.companyAdmin.clientManage.exceptions.ClientNotFoundException;
import com.sales.tracker.companyAdmin.clientManage.repository.ClientManageRepository;
import com.sales.tracker.companyAdmin.clientManage.service.ClientManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.sales.tracker.companyAdmin.clientManage.model.ClientManage;

@Service
public class ClientManageServiceImpl implements ClientManageService {

	@Autowired
	private ClientManageRepository clientRepository;

	@Override
	public List<ClientManage> companyInformation(ClientManage company) {
		List<ClientManage> getAllCompanyInfo = (List<ClientManage>) clientRepository.findAll();
		return getAllCompanyInfo;
	}

	@Override
	public ClientManage getCompanyById(int id) {
		ClientManage getCompanyById = clientRepository.findById(id);
		if(getCompanyById ==null) {
			throw new ClientNotFoundException("Client id is not found " + HttpStatus.BAD_REQUEST);
		}
		return getCompanyById;
	}

	@Override
	public ClientManage editCompany(ClientManage company) {
		ClientManage edit = clientRepository.save(company);
		return edit;
	}

	@Override
	public void deleteCompanyById(int id) {
	         
		if(clientRepository.findById(id)==null) {
			throw new ClientNotFoundException("you enterd wrong id  " + HttpStatus.BAD_REQUEST);
		}
		clientRepository.deleteById(id);

	}

	@Override
	public ClientManage createCompany(ClientManage company) {
		ClientManage saveCompany = clientRepository.save(company);
		if(saveCompany !=null) {
			throw new ClientNotFoundException("Company Created Successfulyy !! ");
		}
		return saveCompany;
	}

}
