<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<div role="tabpanel" class="tab-pane fade active in" id="read1" aria-labelledby="read1-tab">
                              <div class="wthree_asia_europe">
                                 <h4><b>Asia</b></h4>
                                 <table class="w3_agile_all_trade w3_table_trade">
                                    <tbody>
									<c:forEach items="${listWorldData}" var="listWorldDataVar">
									<c:if test="${listWorldDataVar.contentName eq 'Asia Pacific' and listWorldDataVar.contentId lt '8111'}">
                                       <tr>
                                          <th>
                                             <a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">
                                             ${listWorldDataVar.indexName}
                                             <span style="font-size:9px; font-family:arial; color:#666666;font-weight:normal;">(Aug 18)</span>
                                             </a>
                                          </th>
                                          <td class="agileits_w3layouts_td">${listWorldDataVar.price}</td>
                                          <td class="agileits_w3layouts_td" style="color:#ff5000">${listWorldDataVar.value}</td>
                                       </tr>
									</c:if>
									</c:forEach>   
                                    </tbody>
                                 </table>
                                 <h4><b>Europe</b></h4>
                                 <table class="w3_agile_all_trade w3_table_trade">
                                    <tbody>
									<c:forEach items="${listWorldData}" var="listWorldDataVar">
									<c:if test="${listWorldDataVar.contentName eq 'Europe' and listWorldDataVar.contentId lt '8126'}">
                                       <tr>
                                          <th>
                                             <a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">
                                             ${listWorldDataVar.indexName}
                                             <span style="font-size:9px; font-family:arial; color:#666666;font-weight:normal;">(Aug 18)</span>
                                             </a>
                                          </th>
                                          <td class="agileits_w3layouts_td">${listWorldDataVar.price}</td>
                                          <td class="agileits_w3layouts_td" style="color:#00AA00">${listWorldDataVar.value}</td>
                                       </tr>
                                    </c:if>
									</c:forEach>    
                                    </tbody>
                                 </table>
                              </div>
                           </div>