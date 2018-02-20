package com.console.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.avaldes.model.Issuer;
import com.console.users.command.SearchCommand;
import com.console.users.model.LatestNews;
import com.console.users.model.MarketProfiters;
import com.console.users.model.Marquee;
import com.console.users.model.MostRead;
import com.console.users.model.NewsFlash;
import com.console.users.model.Sectors;
import com.console.users.model.SponsoredLinks;
import com.console.users.model.StockTicker;
import com.console.users.model.TopNews;
import com.console.users.model.ViewsRecomendation;
import com.console.users.model.WorldData;
import com.console.users.service.GainerLosersDaoService;
import com.console.users.service.LatestNewsDaoService;
import com.console.users.service.MarqueeDaoService;
import com.console.users.service.MostReadDaoService;
import com.console.users.service.NewsFlashDaoService;
import com.console.users.service.SectorsDaoService;
import com.console.users.service.SponsoredLinksDaoService;
import com.console.users.service.StockTickerDaoService;
import com.console.users.service.ThreeTabsDataDaoService;
import com.console.users.service.TopNewsDaoService;
import com.console.users.service.MarketProfitersDaoService;
import com.console.users.service.ViewsRecomendationsDaoService;
import com.console.users.service.WorldDataDaoService;
import com.fasterxml.jackson.databind.ObjectMapper;





@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
    private Map<String, Issuer> issuers = new HashMap<String, Issuer>();
	
	public MainController() {
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
	
	@Autowired
	LatestNewsDaoService latestNewsDaoService;
	
	@Autowired
	TopNewsDaoService topNewsDaoService;
	
	@Autowired
	MostReadDaoService mostReadDaoService;
	
	@Autowired
	SectorsDaoService sectorsDaoService;
	
	@Autowired
	GainerLosersDaoService gainerLosersDaoService;
	
	@Autowired
	WorldDataDaoService worldDataDaoService;
	
	@Autowired
	ThreeTabsDataDaoService threeTabsDataService;
	
	@Autowired
	ViewsRecomendationsDaoService viewsRecomendationsDaoService;
	
	@Autowired
	MarketProfitersDaoService marketProfitersDaoService;
	
	@Autowired
	NewsFlashDaoService newsFlashDaoService;
	
	@Autowired
	SponsoredLinksDaoService sponsoredLinksDaoService;

	@Autowired
	StockTickerDaoService stockTickerDaoService;
	
	@Autowired
	MarqueeDaoService marqueeDaoService;
	
	

	/*@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security + Hibernate Example");
		model.addObject("message", "This is default page!");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security + Hibernate Example");
		model.addObject("message", "This page is for ROLE_ADMIN only!");
		model.setViewName("admin");

		return model;

	}*/
	
	@RequestMapping(value = "/home**", method = RequestMethod.GET)
	public ModelAndView homePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security + Hibernate Example");
		model.addObject("message", "This page is for ROLE_ADMIN only!");
		model.setViewName("home");

		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
			/*model.setViewName("login");
			return model;*/
		}
		model.setViewName("login");
		//model.setViewName("home");

		return model;

	}

	// customize the error message
	private String getErrorMessage(HttpServletRequest request, String key) {

		Exception exception = (Exception) request.getSession().getAttribute(key);

		String error = "";
		if (exception instanceof BadCredentialsException) {
			error = "Invalid username and password!";
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else {
			error = "Invalid username and password!";
		}

		return error;
	}

	// for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();

		// check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);

			model.addObject("username", userDetail.getUsername());

		}

		model.setViewName("403");
		return model;

	}

	
	@RequestMapping(value = "/getLatestNews**", method = RequestMethod.GET)
	public ModelAndView getLatestNews() {
		System.out.println("controll in latest news");
		List<LatestNews> listLatestNews = latestNewsDaoService.getAllLatestNews();
		ModelAndView model = new ModelAndView();
		System.out.println("@getLatestNews");
		model.addObject("listLatestNews", listLatestNews);
		model.setViewName("latestNews");

		return model;

	}
	
	
	@RequestMapping(value = "/getTopNews**", method = RequestMethod.GET)
	public ModelAndView getTopNews() {
		ModelAndView model = new ModelAndView();
		try {
			System.out.println("controll in Top news");
			List<TopNews> listTopNews = topNewsDaoService.getAllTopNews();
			System.out.println("@getTopNews");
			for(int i=0;i>listTopNews.size();i++){
			System.out.println(listTopNews.get(i).getTopNewsName());
			System.out.println(listTopNews.get(i).getNewsId());
			
			}
			
			model.addObject("listTopNews",listTopNews);
			model.setViewName("topNews");
			
			
		}

			 catch (Exception e) {
			// TODO: handle exception
		}
		
		return model;
		}
	
	@RequestMapping(value = "/getMostRead**", method = RequestMethod.GET)
	public ModelAndView getMostRead() {
		try {
		
	        System.out.println("in get most read");
			List listMostRead = mostReadDaoService.getAllMostRead();
			ModelAndView model = new ModelAndView();
			System.out.println("@getMostRead");
			model.addObject("listMostRead", listMostRead);
			model.setViewName("mostRead");
			return model;
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	
	@RequestMapping(value = "/getSectors**", method = RequestMethod.GET)
	public ModelAndView getSectors() {
		try {
		
	        System.out.println("in get sectors");
			List<Sectors> listSectors = sectorsDaoService.getAllSectors();
			ModelAndView model = new ModelAndView();
			System.out.println("@getSectors");
			model.addObject("listSectors",listSectors);
			model.setViewName("sectors");
			return model;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}
	
	@RequestMapping(value = "/getGainerLosers**", method = RequestMethod.GET)
	public ModelAndView getGainerLosers() {
		try {

			System.out.println("in getGainerLosers");
			List listGainersLosers = gainerLosersDaoService.getAllgainerLosers();
			ModelAndView model = new ModelAndView();
			System.out.println("@getGainerLosers");
			model.addObject("listGainersLosers", listGainersLosers);
			model.setViewName("gainerLosers");
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}
	
	@RequestMapping(value ="/getWorldData**",method =RequestMethod.GET)
	public ModelAndView getWorldData(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getWorldData()");
			List listWorldData=worldDataDaoService.getWorldData();
			for(int i=0;i<listWorldData.size();i++){
				WorldData WorldData=(WorldData)listWorldData.get(i);
				System.out.println(WorldData.getContentName());
				System.out.println(WorldData.getIndexName());
				System.out.println(WorldData.getPrice());
				System.out.println(WorldData.getValue());
				System.out.println(WorldData.getContentId());
			}
			System.out.println("@getWorldData()");
			model.addObject("listWorldData",listWorldData);
			model.setViewName("world");
			
		}
		catch(Exception e){
			//TODO:handle exception
		}
		
		return model;
	}
	
	
	@RequestMapping(value="/getthreetabsdata**",method=RequestMethod.GET)
	public ModelAndView getThreeTabsData(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getThreeTabsData");
			List listStocksData=threeTabsDataService.getStocksData();
			List listFundsData=threeTabsDataService.getFundsData();
			List listCommoditiesData=threeTabsDataService.getCommoditiesData();
		System.out.println("@getthreetabsdata()");
		model.addObject("listStocksData",listStocksData);
		model.addObject("listFundsData",listFundsData);
		model.addObject("listCommoditiesData",listCommoditiesData);
		model.setViewName("threetabs");
		System.out.println("@getthreetabsdata()");
	}
	catch(Exception e){
		//TODO:handle exception
	}
	
	return model;
	}
	
	
	@RequestMapping(value="/getviewsrecomendations**",method=RequestMethod.GET)
	public ModelAndView getViewsRecomendations(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getViewsRecomendations");
			List viewsRecomendationsList=viewsRecomendationsDaoService.getViewsRecomendations();
			for(int i=0;i<viewsRecomendationsList.size();i++){
				ViewsRecomendation viewsRecomendation=(ViewsRecomendation)viewsRecomendationsList.get(i);
				System.out.println(viewsRecomendation.getCompanyName());
				System.out.println(viewsRecomendation.getShortDiscription());
				System.out.println(viewsRecomendation.getCreatedDate());
			}
			System.out.println("@getViewsRecomendations");
			model.addObject("viewsRecomendationsList",viewsRecomendationsList);
			model.setViewName("viewsrecomendations");
		}catch(Exception e){
			//TODO:handle exception
		}
		return model;
	}
	
	@RequestMapping(value="/getMarketProfiters**",method=RequestMethod.GET)
	public ModelAndView getMarketProfiters(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getMarketProfiters");
			List marketProfitersList=marketProfitersDaoService.getMarketProfiters();
			for(int i=0;i<marketProfitersList.size();i++){
				MarketProfiters marketProfiters=(MarketProfiters)marketProfitersList.get(i);
				System.out.println(marketProfiters.getProfiterSays());
				System.out.println(marketProfiters.getAnalysis3());
			}
			System.out.println("@getMarketProfiters");
			model.addObject("marketProfitersList",marketProfitersList);
			model.setViewName("marketprofiters");
		}catch(Exception e){
			//TODO:handle exception
		}
		return model;
	}
	
	
	@RequestMapping(value="/getNewsFlash**",method=RequestMethod.GET)
	public ModelAndView getNewsFlash(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getNewsFlash");
			List newsFlashList=newsFlashDaoService.getNewsFlash();
			for(int i=0;i<newsFlashList.size();i++){
				NewsFlash newsFlash=(NewsFlash)newsFlashList.get(i);
				System.out.println(newsFlash.getCompanyName());
				System.out.println(newsFlash.getCompanyDiscription());
			}
			System.out.println("@getNewsFlash");
			model.addObject("newsFlashList",newsFlashList);
			model.setViewName("newsflash");
		}catch(Exception e){
			//TODO:handle exception
		}
		return model;
	}
	
	
	@RequestMapping(value="/getSponsoredLinks**",method=RequestMethod.GET)
	public ModelAndView getSponsoredLinks(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getSponsoredLinks");
			List sponsoredLinksList=sponsoredLinksDaoService.getsponsoredLinks();
			for(int i=0;i<sponsoredLinksList.size();i++){
				SponsoredLinks sponsoredLinks=(SponsoredLinks)sponsoredLinksList.get(i);
				System.out.println(sponsoredLinks.getCatagoryName());
				System.out.println(sponsoredLinks.getCatagoryDiscription());
			}
			System.out.println("@getSponsoredLinks");
			model.addObject("sponsoredLinksList",sponsoredLinksList);
			model.setViewName("sponsoredlinks");
		}catch(Exception e){
			//TODO:handle exception
		}
		return model;
	}
	
	
	@RequestMapping(value="/getStockTickerData**",method=RequestMethod.GET)
	public ModelAndView getStockTickerData(){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("in getStockTickerData");
			List stockTickerList=stockTickerDaoService.getStockTickerData();
			Map map=new HashMap();
			List list1=new LinkedList();
			List list2=new LinkedList();
			List list3=new LinkedList();
			for(int i=0;i<stockTickerList.size();i++){
				if(i<=0 || i<5){
					list1.add(stockTickerList.get(i));
				}
				if(i>5 || i<9){
					list2.add(stockTickerList.get(i));
				}
				if(i<13){
					list3.add(stockTickerList.get(i));
				}
			}
			map.put("key1",list1);
			map.put("key2",list2);
			map.put("key3",list3);
			
			for(int i=0;i<stockTickerList.size();i++){
				StockTicker stockTicker=(StockTicker)stockTickerList.get(i);
				System.out.println(stockTicker.getIndexName());
				System.out.println(stockTicker.getStocktickerID());
			}
			System.out.println("@getStockTickerData");
			model.addObject("map",map);
			model.setViewName("stockticker");
		}catch(Exception e){
			//TODO:handle exception
		}
		return model;
	}
	
	
	@RequestMapping(value = "/getmarquee**", method = RequestMethod.GET)
	public ModelAndView getMarquee() {
       System.out.println("in get Marquee");
		List<Marquee> listMarquee = marqueeDaoService.getMarquee();
		ModelAndView model = new ModelAndView();
		System.out.println("@getMarquee");
		model.addObject("listMarquee", listMarquee);
		model.setViewName("marquee");

		return model;

	}
	
	
	@RequestMapping(value = "/welcome**", method = RequestMethod.GET)
	public ModelAndView loadWelcome() {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		return model;

	}
	
}