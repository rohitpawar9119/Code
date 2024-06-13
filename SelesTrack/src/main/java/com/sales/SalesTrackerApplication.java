package com.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sales.tracker.superAdmin.companySizeManage.service.impl.CompanySizeManagerImpl;

@SpringBootApplication(scanBasePackages = { "com.*" })
@EntityScan(basePackages = { "com.*" })
@EnableJpaRepositories(basePackages = { "com.*" })
@EnableMongoRepositories
//(basePackageClasses = CompanySizeManagerImpl.class)
public class SalesTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesTrackerApplication.class, args);
	}

}
