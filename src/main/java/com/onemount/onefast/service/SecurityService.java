package com.onemount.onefast.service;

import com.onemount.onefast.model.User;
import org.springframework.stereotype.Service;

@Service
public interface SecurityService {
    User getCurrentUser();
    Long getCurrentUserId();
    String getCurrentEmail();
    boolean currentUserIsAdmin();
}
