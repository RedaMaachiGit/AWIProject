/*
 * 
 */
package com.aiop.yourtask.web.security;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;

// TODO: Auto-generated Javadoc
/**
 * The Class CookieSecurityContext.
 */
public class CookieSecurityContext implements SecurityContext {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The authentication. */
  private Authentication authentication;
  
  /**
   * Instantiates a new cookie security context.
   *
   * @param userDetails the user details
   */
  public CookieSecurityContext(UserDetails userDetails) {
    this.authentication = new AuthenticationImpl(userDetails);
  }
  
  /* (non-Javadoc)
   * @see org.springframework.security.core.context.SecurityContext#getAuthentication()
   */
  @Override
  public Authentication getAuthentication() {
    return authentication;
  }

  /* (non-Javadoc)
   * @see org.springframework.security.core.context.SecurityContext#setAuthentication(org.springframework.security.core.Authentication)
   */
  @Override
  public void setAuthentication(Authentication authentication) {
    throw new UnsupportedOperationException("Should not be called by the code path");
  }
  
  /**
   * The Class AuthenticationImpl.
   */
  private static class AuthenticationImpl implements Authentication {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The user details. */
    private final UserDetails userDetails;
    
    /**
     * Instantiates a new authentication impl.
     *
     * @param userDetails the user details
     */
    public AuthenticationImpl(UserDetails userDetails) {
      this.userDetails = userDetails;
    }
    
    /* (non-Javadoc)
     * @see java.security.Principal#getName()
     */
    @Override
    public String getName() {
      return userDetails.getUsername();
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.Authentication#getAuthorities()
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      return userDetails.getAuthorities();
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.Authentication#getCredentials()
     */
    @Override
    public Object getCredentials() {
      return userDetails.getPassword();
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.Authentication#getDetails()
     */
    @Override
    public Object getDetails() {
      return userDetails;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.Authentication#getPrincipal()
     */
    @Override
    public Object getPrincipal() {
      return userDetails.getUsername();
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.Authentication#isAuthenticated()
     */
    @Override
    public boolean isAuthenticated() {
      return true;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.Authentication#setAuthenticated(boolean)
     */
    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
      throw new UnsupportedOperationException("Should not be invoked from any code downstream");
    }
  }

}
