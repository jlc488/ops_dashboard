package com.tcs.ops.common.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

 /**
 * <PRE>
 * <b>Title: Dashboard Project</b> 
 * <b>
 * </b>
 *
 * <b>Copyright:</b> Copyright (c) 2012
 * <b>Company:</b> TCS
 * <b>Version:</b> 1.0
 * </PRE>
 * @author sin.kang@tcs.com aka SexySinny
 * @history <li> </li>
 */
public class LoginFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest req,
			HttpServletResponse resp, AuthenticationException auth)
			throws IOException, ServletException {
		String a = req.getParameter("j_username");
		String pass = req.getParameter("j_password");
		System.out.println("----------LoginFailureHandler---------------------------------"+a+"---------------------------------");
		System.out.println("-------------------------------------------"+pass+"---------------------------------");
		resp.sendRedirect(req.getContextPath() + "/users/login");

	}

}
