/*
 * 
 */
package com.aiop.yourtask.web.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.aiop.yourtask.service.CustomUserDetailsService;

// TODO: Auto-generated Javadoc
/**
 * The Class CookieAuthenticationFilter.
 */
public class CookieAuthenticationFilter extends GenericFilterBean {

  /** The user detail service. */
  private final CustomUserDetailsService userDetailService;

  /** The cookie service. */
  private final CookieService cookieService;
  
  /**
   * Instantiates a new cookie authentication filter.
   */
  public CookieAuthenticationFilter() {
	    this.userDetailService = new CustomUserDetailsService();
	    this.cookieService =  new CookieService.Impl();
	  }

  /**
   * Instantiates a new cookie authentication filter.
   *
   * @param userDetailService the user detail service
   * @param cookieService the cookie service
   */
  public CookieAuthenticationFilter(CustomUserDetailsService userDetailService,
      CookieService cookieService) {
    this.userDetailService = userDetailService;
    this.cookieService = cookieService;
  }

  /** The Constant FILTER_APPLIED. */
  static final String FILTER_APPLIED = "__spring_security_scpf_applied";

  /* (non-Javadoc)
   * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
   */
  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
    ServletException {
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) res;

    if (request.getAttribute(FILTER_APPLIED) != null) {
      // ensure that filter is only applied once per request
      chain.doFilter(request, response);
      return;
    }

    request.setAttribute(FILTER_APPLIED, Boolean.TRUE);

    SecurityContext contextBeforeChainExecution = loadSecurityContext(request);

    try {
      SecurityContextHolder.setContext(contextBeforeChainExecution);
      chain.doFilter(request, response);
    }
    finally {
     // Clear the context and free the thread local
      SecurityContextHolder.clearContext();
      request.removeAttribute(FILTER_APPLIED);
    }
  }

  /**
   * Loads information such as roles etc about the user if the user cookie were present.
   * This is a great place to introduce a cache if required to prevent hitting ldap on every call.
   * 
   * @param request HttpServletRequest
   * @return A SecurityContext
   */
  private SecurityContext loadSecurityContext(HttpServletRequest request) {
    final String userName = cookieService.extractUserName(request.getCookies());

    return userName != null
        ? new CookieSecurityContext(userDetailService.loadUserByUsername(userName))
        : SecurityContextHolder.createEmptyContext();
  }
}
