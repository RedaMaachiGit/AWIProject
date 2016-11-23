package com.aiop.yourtask.web.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.LdapUserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class AuthSuccessHandler implements AuthenticationSuccessHandler {
 
  private CookieService cookieService;
  
  public AuthSuccessHandler() {
	    this.cookieService = new CookieService.Impl();
  }
 
  public AuthSuccessHandler(CookieService cookieService) {
    this.cookieService = cookieService;
  }
  
  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
    Authentication authentication) throws IOException, ServletException {
	  	SecurityContext context = SecurityContextHolder.getContext();
	    Object principalObj = context.getAuthentication().getPrincipal();
	    UserDetails principal = ((UserDetails) principalObj);
	    //String principal = ((UserDetails) principalObj).getUsername();
	            
	    //response.addCookie(cookieService.createCookie(principal));
	    //SimpleGrantedAuthority roleAdmin = new SimpleGrantedAuthority("ROLE_ADMIN");
	    //GrantedAuthority gA;
	    Object[] roles = principal.getAuthorities().toArray();
	    GrantedAuthority principalRole = (GrantedAuthority) roles[roles.length-1];
	    
	    if(principalRole.getAuthority() == "ROLE_USER"){
	    	response.sendRedirect("./su/activities");
	    	
	    }else if(principalRole.getAuthority() == "ROLE_ADMIN"){
	    	response.sendRedirect("./admin");
	    }else{
	    	response.sendRedirect("./sc/products");
	    }
  }
}
