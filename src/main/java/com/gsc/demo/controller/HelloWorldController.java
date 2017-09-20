package com.gsc.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsc.demo.domain.User;

/**
 * @author shichaogeng
 *
 * 2017年9月19日
 */
@Controller
public class HelloWorldController {
	
	@Value("${application.hello:Hello jack}")
	public String hello;

	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setUsername("張三");
		user.setPassword("3124t");
		return user;
	}
	
	@RequestMapping("/page")
	public String page(Model model) {
		model.addAttribute("time",  new Date());
		model.addAttribute("message",  this.hello);
		return "index";
	}
	
	@RequestMapping("/freemarker")
	public String freemarker(Map<String, Object> map) {
		map.put("name", "[Angel -- 守护天使]");
        map.put("gender", 1);//gender:性别，1：男；0：女；  
        
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "jack");
        friend.put("age", 30);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "jeff");
        friend.put("age", 36);
        friends.add(friend);
        map.put("friends", friends);
        return "freemarker";
	}
}
