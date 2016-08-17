package com.example.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.example.util.Constants;

@Component
public class AccountFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init!!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Filter!!");
        HttpServletRequest req = (HttpServletRequest) request;
        String tenantId = req.getHeader("X-Tenant-Id");
        if (tenantId != null) {
        	req.setAttribute(Constants.CURRENT_TENANT_IDENTIFIER, tenantId);
        } else {
        	req.setAttribute(Constants.CURRENT_TENANT_IDENTIFIER, Constants.UNKNOWN_TENANT);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy!!");
    }
}
