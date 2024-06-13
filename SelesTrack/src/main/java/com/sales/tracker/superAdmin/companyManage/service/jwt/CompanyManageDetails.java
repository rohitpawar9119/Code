package com.sales.tracker.superAdmin.companyManage.service.jwt;


import com.sales.tracker.superAdmin.companyManage.model.CompanyManage;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyManageDetails implements UserDetails {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public CompanyManageDetails(CompanyManage company) {
        username = company.getUsername();
        password = company.getPassword();
        authorities = Arrays.stream(company.getRoles().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}