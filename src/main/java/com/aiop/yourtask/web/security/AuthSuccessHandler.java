/*
 * 
 */
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

// TODO: Auto-generated Javadoc
/**
 * The Class AuthSuccessHandler.
 */
public class AuthSuccessHandler implements AuthenticationSuccessHandler {
 
  /** The cookie service. */
  private CookieService cookieService;
  
  /**
   * Instantiates a new auth success handler.
   */
  public AuthSuccessHandler() {
	    this.cookieService = new CookieService.Impl();
  }
 
  /**
   * Instantiates a new auth success handler.
   *
   * @param cookieService the cookie service
   */
  public AuthSuccessHandler(CookieService cookieService) {
    this.cookieService = cookieService;
  }
  
  /* (non-Javadoc)
   * @see org.springframework.security.web.authentication.AuthenticationSuccessHandler#onAuthenticationSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
   */
  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
    Authentication authentication) throws IOException, ServletException {
	  	SecurityContext context = SecurityContextHolder.getContext();
	    Object principalObj = context.getAuthentication().getPrincipal();
	    UserDetails principal = ((UserDetails) principalObj);
	            
	    //response.addCookie(cookieService.createCookie(principal));

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
