package com.aiop.yourtask.web.security;

import org.springframework.security.core.Authentication;
import com.aiop.yourtask.domain.Yourtaskuser;

public interface AuthenticationFacade {
    Authentication getAuthentication();
    Yourtaskuser getActiveUser();
}

