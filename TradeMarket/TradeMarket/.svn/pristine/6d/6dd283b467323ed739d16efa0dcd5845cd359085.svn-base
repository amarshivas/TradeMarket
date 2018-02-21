<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<div role="tabpanel" class="tab-pane fade active in" id="latest1" aria-labelledby="latest1-tab">
                              <div class="agile_market_trade">
                                 <table class="w3_agile_all_trade w3_table_trade">
                                    <tbody>
									<c:forEach items="${listSectors}" var="listSectorsVar">
                                       <tr>
                                          <th>
                                             <a href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/single.html">
                                             <span>${listSectorsVar.sectorName}</span>
                                             </a>
                                          </th>
                                          <td class="agileits_w3layouts_td">${listSectorsVar.priceValue}</td>
                                          <td class="agileits_w3layouts_td" style="color:#00AA00">${listSectorsVar.changeValue}</td>
                                       </tr>
									   </c:forEach>
                                    </tbody>
                                 </table>
                              </div>
                           </div>