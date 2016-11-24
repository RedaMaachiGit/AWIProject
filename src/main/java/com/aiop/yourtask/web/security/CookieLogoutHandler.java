/*
 * 
 */
package com.aiop.yourtask.web.security;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class CookieLogoutHandler.
 */
public class CookieLogoutHandler implements LogoutHandler {
  
  /** The cookie service. */
  private final CookieService cookieService;
  
  /**
   * Instantiates a new cookie logout handler.
   *
   * @param cookieService the cookie service
   */
  public CookieLogoutHandler(CookieService cookieService) {
    this.cookieService = cookieService;
  }
  
  /* (non-Javadoc)
   * @see org.springframework.security.web.authentication.logout.LogoutHandler#logout(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
   */
  @Override
  public void logout(HttpServletRequest request, HttpServletResponse response,
    Authentication authentication) {
   
    Cookie cookie = cookieService.getCookie(CookieService.COOKIE_NAME, request.getCookies());
    
    if (cookie != null) {
      Cookie empty = new Cookie(CookieService.COOKIE_NAME, "");
      empty.setMaxAge(0);
      response.addCookie(empty);
    }
    SecurityContextHolder.clearContext();
  }
}
