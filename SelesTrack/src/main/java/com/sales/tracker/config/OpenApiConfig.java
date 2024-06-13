package com.sales.tracker.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(name = "SalesTracker", email = "suyog@dextercrew.com"), description = "OpenApi Documentation for JwtSecurity testing with swagger", title = "Dexter_Crew implements Open-Api With SalesTracker Appliction ", version = "1.0", license = @License(name = "license_name", url = "url"), termsOfService = "Terms of Service"), servers = {
		@Server(description = "local_enviroment localhost", url = "http://localhost:8085"),
		@Server(description = "DEV enviroment", url = "http://localhost:8086"),
		@Server(description = "TEST enviroment", url = "http://localhost:8087"),
		@Server(description = "PROD enviroment", url = "http://localhost:8088")
		},security= {@SecurityRequirement(name = "Bearer") }

)
@SecurityScheme(
           name="Bearer",
           description="Jwt Authontication description",
           scheme="bearer", 
           type = SecuritySchemeType.HTTP,
           bearerFormat="JWT",
           in=SecuritySchemeIn.HEADER
		)
public class OpenApiConfig {

}
