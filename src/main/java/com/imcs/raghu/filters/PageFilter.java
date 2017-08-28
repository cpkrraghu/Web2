package com.imcs.raghu.filters;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class SecurityFilter
 */
public class PageFilter implements Filter {
	final static Logger logger=Logger.getLogger(PageFilter.class);
    /**
     * Default constructor. 
     */
    public PageFilter() {
        // TODO Auto-generated constructor stub
    }
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		HttpSession session = httpRequest.getSession(false);
		logger.info(httpRequest.getRequestURI()+ " is the request url");
		//httpResponse.sendRedirect(httpRequest.getRequestURI());
		
		chain.doFilter(request, response);
	}

	private boolean isSecuredResource(HttpServletRequest httpRequest) {
		String uri = httpRequest.getRequestURI();

		return !uri.contains("login");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
