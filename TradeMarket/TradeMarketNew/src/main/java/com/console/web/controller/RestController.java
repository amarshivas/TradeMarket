package com.console.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.avaldes.model.Issuer;
import com.console.users.model.SearchCriteria;
import com.console.users.service.VolumeToppersDaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	private Map<String, Issuer> issuers = new HashMap<String, Issuer>();
	
	public RestController() {
		// pre-initialize the list of issuers available ...
		
		issuers.put("ATEN", new Issuer("ATEN", "A10 Networks Inc", "corp", "USA"));
		issuers.put("AAPL", new Issuer("AAPL", "Apple Inc", "corp", "USA"));
		issuers.put("T", new Issuer("T", "AT&T", "corp", "USA"));
		issuers.put("CSCO", new Issuer("CSCO", "Cisco Systems, Inc.", "corp", "USA"));
		issuers.put("CTXS", new Issuer("CTXS", "Citrix Systems, Inc.", "corp", "USA"));
		issuers.put("GOOGL", new Issuer("GOOGL", "Google Inc", "corp", "USA"));
		issuers.put("IBM", new Issuer("IBM", "IBM", "corp", "USA"));
		issuers.put("JNPR", new Issuer("JNPR", "Juniper Networks, Inc.", "corp", "USA"));
		issuers.put("MSFT", new Issuer("MSFT", "Microsoft Corporation", "corp", "USA"));
		issuers.put("ORCL", new Issuer("ORCL", "Oracle Corporation", "corp", "USA"));
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "status";
	}
	
	@RequestMapping(value="/issuers", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Issuer> getAllIssuers() {
		logger.info("Inside getAllIssuers() method...");
		
		return issuers;
	}
	
	@RequestMapping(value="/issuer/{ticker}", method=RequestMethod.GET)
	@ResponseBody
	public String getIssuerByTicker(@PathVariable("ticker") String ticker) {
		try {
			Issuer myIssuer = issuers.get(ticker); 
			
			if (myIssuer != null) {
				logger.info("Inside getIssuerByTicker, returned: " + myIssuer.toString());
			} else {
				logger.info("Inside getIssuerByTicker, ticker: " + ticker + ", NOT FOUND!");
			}
			String myIssuerResponse = new ObjectMapper().writeValueAsString(myIssuer);
			return myIssuerResponse;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@RequestMapping(value="/issuer/delete/{ticker}", method=RequestMethod.GET)
	@ResponseBody
	public String deleteIssuerByTicker(@PathVariable("ticker") String ticker) {
		String myIssuerResponse  ="";
		try {
		Issuer myIssuer = issuers.remove(ticker); 
		
		if (myIssuer != null) {
			logger.info("Inside deleteIssuerByTicker, deleted: " + myIssuer.toString());
		} else {
			logger.info("Inside deleteIssuerByTicker, ticker: " + ticker + ", NOT FOUND!");
		}
		myIssuerResponse = new ObjectMapper().writeValueAsString(myIssuer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return myIssuerResponse;
	}

	@RequestMapping(value="/issuer/create", method=RequestMethod.GET)
	public ModelAndView addIssuer() {
		
		return new ModelAndView("addIssuer", "command", new Issuer());
	}
	
	@RequestMapping(value="/issuer/addIssuer", method=RequestMethod.POST)
	@ResponseBody
	public String addIssuer(@ModelAttribute("issuer") Issuer issuer) {
		String issuerResponse="";
		try {
			
		if (issuer != null) {
			logger.info("Inside addIssuer, adding: " + issuer.toString());
		} else {
			logger.info("Inside addIssuer...");
		}
		issuers.put(issuer.getTicker(), issuer);
		
		issuerResponse = new ObjectMapper().writeValueAsString(issuer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return issuerResponse;
		
	}
	
	@RequestMapping(value = "/searchNews", method = RequestMethod.GET)
	@ResponseBody
	public String searchNews(@RequestParam(value="keyword", required=true) String keyword) {
       System.out.println("in searchNews"+keyword);
       String ticker ="IBM";
       try {
			Issuer myIssuer = issuers.get(ticker); 
			if (myIssuer != null) {
				logger.info("Inside getIssuerByTicker, returned: " + myIssuer.toString());
			} else {
				logger.info("Inside getIssuerByTicker, ticker: " + ticker + ", NOT FOUND!");
			}
			
			String serialized = new ObjectMapper().writeValueAsString(myIssuer);
			return serialized;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}
	
	@RequestMapping(value = "/search/api/getSearchResult", method = RequestMethod.POST)
	@ResponseBody
	public String searchNewsNew(@RequestBody SearchCriteria search) {
       System.out.println("in searchNews");

		return "in searchNews"+search.getUsername();

	}
	
	
	
}