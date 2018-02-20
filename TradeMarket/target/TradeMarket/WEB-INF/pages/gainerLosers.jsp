<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<div role="tabpanel" class="tab-pane fade active in" id="experts1" aria-labelledby="experts1-tab">
                              <div class="w3_agileits_gainers">
                                 <ul>
                                    <li><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">Gainers</a><i>|</i></li>
                                    <li><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">NSE</a><i>|</i></li>
                                    <li><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">BSE</a></li>
                                 </ul>
                                 <div class="w3_agileits_gain_list">
                                    <table class="w3_agile_all_trade w3_table_trade">
                                       <tbody>
                                          <tr>
                                             <th class="w3_agileits_head"><b>Company</b></th>
                                             <td class="w3_agileits_head1"><b>Price</b></td>
                                             <td class="w3_agileits_head1"><b>% Gain</b></td>
                                          </tr>
										  <c:forEach items="${listGainersLosers}" var="listGainersLosersVar">
										  <c:if test="${listGainersLosersVar.percentage gt 0}">
                                          <tr>
                                             <th>
                                                <a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">${listGainersLosersVar.companyName}</a>
                                             </th>
                                             <td class="agileits_w3layouts_td">${listGainersLosersVar.price}</td>
                                             <td class="agileits_w3layouts_td"><span style="color:#00AA00">${listGainersLosersVar.percentage}</span>
                                             </td>
                                          </tr>
										  </c:if>
										  </c:forEach>
                                        </tbody>
                                    </table>
                                    <div style="padding-top:10px;font-size:13px;"><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html" style="color:#337ab7;">More �</a></div>
                                 </div>
                                 <ul>
                                    <li><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">Losers</a><i>|</i></li>
                                    <li><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">NSE</a><i>|</i></li>
                                    <li><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">BSE</a></li>
                                 </ul>
                                 <div class="w3_agileits_gain_list">
                                    <table class="w3_agile_all_trade w3_table_trade">
                                       <tbody>
                                          <tr>
                                             <th class="w3_agileits_head"><b>Company</b></th>
                                             <td class="w3_agileits_head1"><b>Price</b></td>
                                             <td class="w3_agileits_head1"><b>% Loss</b></td>
                                          </tr>
										  <c:forEach items="${listGainersLosers}" var="listGainersLosersVar">
										  <c:if test="${0 gt listGainersLosersVar.percentage}">
                                          <tr>
                                             <th>
                                                <a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">${listGainersLosersVar.companyName}</a>
                                             </th>
                                             <td class="agileits_w3layouts_td">${listGainersLosersVar.price}</td>
                                             <td class="agileits_w3layouts_td"><span style="color:#ff5000">${listGainersLosersVar.percentage}</span>
                                             </td>
                                          </tr>
										  </c:if>
										  </c:forEach>
                                       </tbody>
                                    </table>
                                    <div style="padding-top:10px;font-size:13px;"><a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html" style="color:#337ab7;">More �</a></div>
                                 </div>
                              </div>
                           </div>