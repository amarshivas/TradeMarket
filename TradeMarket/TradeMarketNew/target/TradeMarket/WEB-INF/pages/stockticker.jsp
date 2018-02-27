<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<div class="panel-body agile_panel_body">
		  <ul class="demo1" style="overflow-y: hidden; height: 60px;">
				<c:forEach items="${map}" var="entry">
					<li style="" class="news-item">
						<table class="w3_table_trade">
							<tbody>
							<tr>
							<c:forEach items="${entry.value}" var="val">
								<td class="w3_agileits_td demo1_w3_table_trade">
									<table class="agileits_w3layouts_table">
										<tbody>
										 
										<tr>
											<td style="color:#01A9CE;text-transform:uppercase;">${val.indexName}</td>
										</tr>
										<tr>
											<td>${val.priceValue}<i><span class="caret"></span>${val.chngedValue}(${val.changePer}%)</i></td>
										</tr>
								      </tbody>
								 </table>
								</td>
								</c:forEach>
							</tr>
						</tbody></table>
					</li>
					</c:forEach>
				</ul>
			</div>