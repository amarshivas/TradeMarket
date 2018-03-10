package com.jcg.examples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.model.TopNews;
import com.jcg.examples.services.TopNewsDaoService;
import com.jcg.examples.model.LatestNews;
import com.jcg.examples.services.LatestNewsDaoService;

@RestController
public class CustomController {

	@Autowired
	LatestNewsDaoService latestNewsDaoService;

	@Autowired
	TopNewsDaoService topNewsDaoService;

	@RequestMapping(value = "/welcome/{customer}", method = RequestMethod.POST)
	public ResponseEntity<String> welcomeUser(@PathVariable("customer") String customer) {
		System.out.println("Inside welcomeUser in controller");
		return new ResponseEntity<String>("Welcome " + customer, HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {

		System.out.println("Welcome called Login");
		return "welcome";
	}

	@RequestMapping(value = "/getLatestNews", method = RequestMethod.GET)
	public List getLatestNews() {

		System.out.println("controll in latest news");
		List<LatestNews> listLatestNews = latestNewsDaoService.getAllLatestNews();
		System.out.println("@getLatestNews");

		return listLatestNews;

	}

	@RequestMapping(value = "/getTopNews", method = RequestMethod.GET)
	public List getTopNews() {
		try {
			System.out.println("controll in Top news");
			List<TopNews> listTopNews = topNewsDaoService.getAllTopNews();
			System.out.println("@getTopNews");
			
			return listTopNews;
			
		}
			 catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		}
}
