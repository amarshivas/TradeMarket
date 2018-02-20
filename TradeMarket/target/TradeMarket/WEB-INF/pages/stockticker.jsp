<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<div class="panel-body agile_panel_body">
               <ul class="demo1" style="overflow-y: hidden; height: 60px;">
                  <li style="" class="news-item">
				  <c:forEach items="${getStockTickerList}" var="getStockTickerListVar">
				  ${getStockTickerListVar.indexName}
				  </c:forEach>
				  <c:forEach begin="0" end="10" varStatus="loop">
                      Index: ${loop.index}<br/>
                    </c:forEach>
                     <table class="w3_table_trade">
                        <tbody>
                           <tr>
                              <td class="w3_agileits_td demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">NIFTY 50</td>
                                       </tr>
                                       <tr>
                                          <td>8,638.23<i><span class="caret"></span>-8.35(-0.10%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">SILVER</td>
                                       </tr>
                                       <tr>
                                          <td>46,343.56<i><span class="caret"></span>-186.00(-0.40%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;">Dollar-Rupee</td>
                                       </tr>
                                       <tr>
                                          <td>66.8650<i class="wthree_i"><span class="caret caret1"></span>0.00(0.00%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">CRUDEOIL</td>
                                       </tr>
                                       <tr>
                                          <td>3,097.00<i><span class="caret"></span>-7.00(-0.23%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                           </tr>
                        </tbody>
                     </table>
                  </li>
                  <li style="display:none;" class="news-item">
                     <table class="w3_table_trade">
                        <tbody>
                           <tr>
                              <td class="w3_agileits_td demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">gold</td>
                                       </tr>
                                       <tr>
                                          <td>31,350.23<i><span class="caret"></span>-117.00(-0.37%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">ftsc</td>
                                       </tr>
                                       <tr>
                                          <td>6.887.93<i><span class="caret"></span>-5.99(-0.09%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">cac</td>
                                       </tr>
                                       <tr>
                                          <td>4,436.70<i><span class="caret"></span>-23.00(0.54%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">dax</td>
                                       </tr>
                                       <tr>
                                          <td>10,596.00<i><span class="caret"></span>-79.89(-0.75%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                           </tr>
                        </tbody>
                     </table>
                  </li>
                  <li style="display:none;" class="news-item">
                     <table class="w3_table_trade">
                        <tbody>
                           <tr>
                              <td class="w3_agileits_td demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">sensex</td>
                                       </tr>
                                       <tr>
                                          <td>2,7993.64<i><span class="caret"></span>-66.59(-0.24%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">nhai</td>
                                       </tr>
                                       <tr>
                                          <td>1,256.00<i style="color:#00AA00"><span class="caret caret1"></span>16.20(1.31%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;">Euro-Rupee</td>
                                       </tr>
                                       <tr>
                                          <td>75.42<i class="wthree_i"><span class="caret caret1"></span>0.03(0.04%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                              <td class="demo1_w3_table_trade">
                                 <table class="agileits_w3layouts_table">
                                    <tbody>
                                       <tr>
                                          <td style="color:#01A9CE;text-transform:uppercase;">iifl</td>
                                       </tr>
                                       <tr>
                                          <td>1,006.51<i><span class="caret"></span>-1.25(-0.12%)</i></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </td>
                           </tr>
                        </tbody>
                     </table>
                  </li>
               </ul>
            </div>