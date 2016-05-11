package com.kui.security;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xingshukui on 2016/4/7.
 */
public class myFilter extends AbstractSecurityInterceptor implements Filter{

    private FilterInvocationSecurityMetadataSource filterInvocationSecurityMetadataSource;

    public FilterInvocationSecurityMetadataSource getFilterInvocationSecurityMetadataSource() {
        return filterInvocationSecurityMetadataSource;
    }

    public void setFilterInvocationSecurityMetadataSource(FilterInvocationSecurityMetadataSource filterInvocationSecurityMetadataSource) {
        this.filterInvocationSecurityMetadataSource = filterInvocationSecurityMetadataSource;
    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return filterInvocationSecurityMetadataSource;
    }

    public void invoke(FilterInvocation fi) throws IOException,
    ServletException {
        InterceptorStatusToken token= super .beforeInvocation(fi);
        try {
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        } finally {
            super .afterInvocation(token, null );
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        FilterInvocation invocation = new FilterInvocation(servletRequest,servletResponse,filterChain);
        invoke(invocation);
    }

    @Override
    public void destroy() {

    }
}
