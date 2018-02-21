<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
        <h3>Profit from the markets</h3>
                    <div class="w3_slider">    
						<ul class="slides" style="width: 2094px;">
						<c:forEach items="${marketProfitersList}" var="marketProfitersListVar">
                           <li class="slide" style="width: 349px;">
                              <div class="w3_agile_profit_assets_grid">
                                 <div class="w3_agile_profit_assets_left">
                                    <img src=${marketProfitersListVar.imageUrl} alt=" " class="img-responsive">
                                 </div>
                                 <div class="w3_agile_profit_assets_right">
                                    <p><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">${marketProfitersListVar.profiterSays}</a></p>
                                    <ul>
                                       <li><span>*</span> ${marketProfitersListVar.analysis1}</li>
                                       <li><span>*</span> ${marketProfitersListVar.analysis2}</li>
                                       <li><span>*</span> ${marketProfitersListVar.analysis3}</li>
                                    </ul>
                                 </div>
                                 <div class="clearfix"> </div>
                              </div>
                           </li>
						    </c:forEach>
                        </ul>
                     </div>   