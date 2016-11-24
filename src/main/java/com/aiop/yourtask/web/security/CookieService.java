/*
 * 
 */
package com.aiop.yourtask.web.security;

import javax.servlet.http.Cookie;

// TODO: Auto-generated Javadoc
/**
 * This is a naive Cookie implementation. In a true enviorment, one would need 
 * to create a more secure cookie that cannot be spoofed. Use SHA, Salts what have you.
 * For the scope of this example, it will have to do though.
 */
public interface CookieService {
  
  /** The Constant COOKIE_NAME. */
  static final String COOKIE_NAME = "AUTHCOOKIE";
  
  /**
   * Extract user name.
   *
   * @param cookies the cookies
   * @return the string
   */
  public String extractUserName(Cookie[] cookies);
  
  /**
   * Gets the cookie.
   *
   * @param cookieName the cookie name
   * @param cookies the cookies
   * @return the cookie
   */
  public Cookie getCookie(String cookieName, Cookie[] cookies);
  
  /**
   * Creates the cookie.
   *
   * @param userName the user name
   * @return the cookie
   */
  public Cookie createCookie(String userName);
  
  /**
   * The Class Impl.
   */
  public static class Impl implements CookieService {
    
    /* (non-Javadoc)
     * @see com.aiop.yourtask.web.security.CookieService#extractUserName(javax.servlet.http.Cookie[])
     */
    @Override
    public String extractUserName(Cookie[] cookies) {
      Cookie cookie = getCookie(COOKIE_NAME, cookies);
      return cookie == null ? null : cookie.getValue();
    }

    /* (non-Javadoc)
     * @see com.aiop.yourtask.web.security.CookieService#createCookie(java.lang.String)
     */
    @Override
    public Cookie createCookie(String userName) {
      Cookie c = new Cookie(COOKIE_NAME, userName);
      c.setPath("/");                 
      
      return c;
    }

    /* (non-Javadoc)
     * @see com.aiop.yourtask.web.security.CookieService#getCookie(java.lang.String, javax.servlet.http.Cookie[])
     */
    @Override
    public Cookie getCookie(String cookieName, Cookie[] cookies) {
      if (cookies == null) {
        return null;
      }
      
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals(cookieName)) {
          return cookie;
        }
      }

      return null;
    }
  }
}
