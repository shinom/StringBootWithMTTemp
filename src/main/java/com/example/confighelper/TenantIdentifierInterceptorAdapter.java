package com.example.confighelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.repository.master.UserRepository;
import com.example.util.Constants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Component
public class TenantIdentifierInterceptorAdapter extends HandlerInterceptorAdapter {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        String tenantId = req.getHeader("X-Tenant-Id");
        if (tenantId != null) {
        	req.setAttribute(Constants.CURRENT_TENANT_IDENTIFIER, tenantId);
        }
        return true;
    }
}