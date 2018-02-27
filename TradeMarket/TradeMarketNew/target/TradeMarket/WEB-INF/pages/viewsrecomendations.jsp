<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
                     
					 <c:forEach items="${viewsRecomendationsList}" var="viewsRecomendationsListVar">
                        <div class="w3layouts_research_grid1">
                           <a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">
                              <h4>${viewsRecomendationsListVar.companyName}</h4>
                           </a>
                           <p>${viewsRecomendationsListVar.shortDiscription}<a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">more&nbsp;»</a><span>${viewsRecomendationsListVar.createdDate}</span></p>
                        </div>
						</c:forEach>
                      
                  
