/*
 * 
 */
package com.aiop.yourtask.web.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.aiop.yourtask.domain.Yourtaskuser;
import com.aiop.yourtask.service.YourtaskuserService;
// TODO: Auto-generated Javadoc

/**
 * The Class AuthenticationFacadeImpl.
 */
/*
 * AuthenticationFacadeImpl implementing AuthenticationFacade
 */
@Component
public class AuthenticationFacadeImpl implements AuthenticationFacade {
 
	/** The yourtaskuserservice. */
	@Autowired
	YourtaskuserService yourtaskuserservice;
	
    /* (non-Javadoc)
     * @see com.aiop.yourtask.web.security.AuthenticationFacade#getAuthentication()
     */
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

	/* (non-Javadoc)
	 * @see com.aiop.yourtask.web.security.AuthenticationFacade#getActiveUser()
	 */
	@Override
	public Yourtaskuser getActiveUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userDetails = (UserDetails) auth.getCredentials();
		String username = auth.getName();
		return yourtaskuserservice.findByUsername(username);
	}
}