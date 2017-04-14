package fr.imie.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SecurityFilter
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST }, urlPatterns = { "/*" })
public class SecurityFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public SecurityFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		HttpSession session = httpServletRequest.getSession();
		Object user = session.getAttribute("user");
		if (user != null || httpServletRequest.getRequestURI().contains("login")) {
			chain.doFilter(request, response);
		} else {
			String redirectUrl = httpServletRequest.getRequestURI();
			if(httpServletRequest.getQueryString()!=null){
				redirectUrl = redirectUrl .concat("?").concat(httpServletRequest.getQueryString());
			}
			httpServletRequest.getSession().setAttribute("redirectUrl", redirectUrl);
			httpServletResponse.sendRedirect("login");
		}
		
		//redirection vers accueil si la servlet à permis de login
		if (user==null && session.getAttribute("user")!=null){
			String redirectUrl = (String) httpServletRequest.getSession().getAttribute("redirectUrl");
			if(redirectUrl==null){
				httpServletResponse.sendRedirect("projectList");
			}else{
				httpServletResponse.sendRedirect((String) httpServletRequest.getSession().getAttribute("redirectUrl"));
			}
			httpServletRequest.getSession().removeAttribute("redirectUrl");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
