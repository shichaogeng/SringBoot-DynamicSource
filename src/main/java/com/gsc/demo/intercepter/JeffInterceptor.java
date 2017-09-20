package com.gsc.demo.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shichaogeng
 *
 * 2017年9月19日
 */
public class JeffInterceptor implements HandlerInterceptor {

	/**
	 * @author shichaogeng
	 * @date 2017年9月19日
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(this.getClass().getName() + "<------>preHandle");
        return true;
	}

	/**
	 * @author shichaogeng
	 * @date 2017年9月19日
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(this.getClass().getName() + "<------>postHandle");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年9月19日
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(this.getClass().getName()
                + "<------>afterCompletion");
	}

}
