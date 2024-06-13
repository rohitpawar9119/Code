package com.sales.multiple_enviroments_setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
public class DatabaseController {

	@Autowired
	private Environment enviroment;
	
	@GetMapping()
	public DatabseDetails getData() {
		DatabseDetails db = new DatabseDetails();
		
		
		String driverName = 
				enviroment.getProperty("spring.datasource.driver-class-name");
		String port =enviroment.getProperty("server.port");
		String databaseUrl = 
				enviroment.getProperty("spring.datasource.url");
		String username = 
				enviroment.getProperty("spring.datasource.username");
		String password = 
				enviroment.getProperty("spring.datasource.password");
		db.setName(driverName);
		db.setPort(port);
		db.setUrl(databaseUrl);
		db.setUsername(username);
		db.setPassword(password);
		return db;
		
	}
}
