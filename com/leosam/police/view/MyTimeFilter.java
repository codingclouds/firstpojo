package com.leosam.police.view;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * 查看运行时间
 * 
 * @author congli216488
 */
@Order(1)
@Component
public class MyTimeFilter extends OncePerRequestFilter {
	private static Logger logger = LoggerFactory.getLogger(MyTimeFilter.class);

	private static List<String> staticResource1 = Arrays.asList("/static", "/favicon.ico");

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		long start = System.currentTimeMillis();
		filterChain.doFilter(request, response);
		String requestURI = request.getRequestURI();
		boolean isStaticResource = staticResource1.stream().anyMatch(uri -> requestURI.startsWith(uri));
		if (isStaticResource) {
			return;
		}
		if (logger.isInfoEnabled()) {
			long processTime = System.currentTimeMillis() - start;
			logger.info("RequestURL[{}], Referer[{}], TIME[{} ms]", request.getRequestURL().toString(), request.getHeader("Referer"), processTime);
		}
	}
}