package com.xq.live.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	/**
	 * index --list
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/index")
	public String index(HttpServletRequest request,
			HttpServletResponse response)throws Exception{
		return "/user/index";
	}
}
