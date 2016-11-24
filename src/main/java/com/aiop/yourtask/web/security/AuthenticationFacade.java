/*
 * 
 */
package com.aiop.yourtask.web.security;

import org.springframework.security.core.Authentication;
import com.aiop.yourtask.domain.Yourtaskuser;
// TODO: Auto-generated Javadoc
/*
 * Authentication facade interface to retrieve the user informations 
 */

/**
 * The Interface AuthenticationFacade.
 */
public interface AuthenticationFacade {
	
	/**
	 * Gets the authentication.
	 *
	 * @return the authentication
	 */
	/*
	 * Get the current authentication
	 */
    Authentication getAuthentication();
    
    /**
     * Gets the active user.
     *
     * @return the active user
     */
    /*
     * Get the active user
     */
    Yourtaskuser getActiveUser();
}

