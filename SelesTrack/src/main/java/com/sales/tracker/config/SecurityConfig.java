package com.sales.tracker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.sales.tracker.filter.JwtAuthFilter;
import com.sales.tracker.service.UserInfoService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class SecurityConfig {

    @Autowired
    private JwtAuthFilter authFilter;
//    @Autowired
//   private CompanyJwtAuthFilter companyJwtAuthFilter;

    // User Creation
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserInfoService();
    }
//    @Bean
//    public UserDetailsService userDetailsService2() {
//        return new UserInfoService();
//    }

    // Configuring HttpSecurity

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable().authorizeHttpRequests()
                .requestMatchers("/auth/welcome", "/auth/addNewUser", "/auth/generateToken").permitAll()
                .requestMatchers("/auth/message").permitAll()
                .requestMatchers("/swagger-ui/**", "/swagger-ui.html#/", "/v3/api-docs/**", "/env").permitAll()
                .requestMatchers("/v2/api-docs", "/v3/api-docs/**", "/swagger-resources", "/swagger-resources/**", "/swagger-ui/**", "/webjars/**", "/swagger-ui.html").permitAll()
                .requestMatchers("/company/msg", "/company/login", "/company/createCompany", "/company/editCompany", "/company/Information", "/company/Information/{id}", "/company/deleteCompany/{id}","/company/register","/company/verify-account","/company/regenerate-otp").permitAll()
                .requestMatchers("/planPackage/msg", "planPackage/addPackage", "planPackage/editPackage", "planPackage/detailPackage", "planPackage/deletePackage/{id}", "planPackage/Package/{id}", "/planPackage/updatePackage").permitAll()
                .requestMatchers("/workspaceManage/msg", "/workspaceManage/createWorkspace", "/workspaceManage/editWorkspace", "/workspaceManage/detailWorkspace", "/workspaceManage/detailWorkspace/{id}", "/workspaceManage/deleteWorkspace/{id}").permitAll()
                .requestMatchers("/department/addDepartment", "/department/detailDepatrment", "/department/detailDepatrment/{id}", "/department/editDepartment", "/department/deleteDepartment/{id}").permitAll()
                .requestMatchers("/modulesManage/msg", "/modulesManage/addModules", "/modulesManage/detailModule", "/modulesManage/detailModule/{id}", "/modulesManage/editModules", "/modulesManage/deleteModule/{id}").permitAll()
                .requestMatchers("/industryManage/msg", "/industryManage/addIndustry", "/industryManage/editIndustry", "/industryManage/detailIndustry", "/industryManage/detailIndustry/{id}", "/industryManage/deleteIndustry/{id}").permitAll()
                .requestMatchers("/clientManage/msg", "/clientManage/createClient", "/clientManage/editClient", "/clientManage/clientInformation", "/clientManage/clientInformation/{id}", "/clientManage/deleteClient/{id}").permitAll()
                .requestMatchers("/companySize/msg", "/companySize/createCompanySize", "/companySize/detailCompanySize", "/companySize/detailCompanySize/{id}", "/companySize/editCompanySize", "/companySize/deleteCompanySize/{id}").permitAll()
                .requestMatchers("/companySize_S/msg", "/companySize_S/createCompanySize_S", "/companySize_S/detailCompanySize_S", "/companySize_S/detailCompanySize_S/{id}", "/companySize_S/editCompanySize_S", "/companySize_S/deleteCompanySize_S/{id}").permitAll()

                .requestMatchers("/teamMember/msg", "/teamMember/addTeamMember", "/teamMember/detailTeamMember", "/teamMember/detailTeamMember/{id}", "/teamMember/editTeamMember", "/teamMember/deleteTeamMember/{id}").permitAll()
                .requestMatchers("/roleManage/msg", "/roleManage/addRole", "/roleManage/editRole", "/roleManage/detailRole", "/roleManage/detailRole/{id}", "/roleManage/deleteRole/{id}").permitAll()
                .and().authorizeHttpRequests().requestMatchers("/auth/user/**").authenticated().and()
                .authorizeHttpRequests().requestMatchers("/auth/admin/**").authenticated().and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class).build();
//                .addFilterAfter(companyJwtAuthFilter, UsernamePasswordAuthenticationFilter.class).build();
    }

    // Password Encoding
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
    
    

}
