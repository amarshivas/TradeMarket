<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

                     <h3><i class="fa fa-bolt" aria-hidden="true"></i>News Flash</h3>
                     <div class="agileits_news_flash_table">
                        <ul class="demo2" style="overflow-y: hidden; height: 138px;">
						<c:forEach items="${newsFlashList}" var="newsFlashListVar">
                        <li style="" class="news-item1"><strong>${newsFlashListVar.companyName}   :&nbsp;</strong>${newsFlashListVar.companyDiscription}</li>
						</c:forEach>
						</ul>
                     </div>
                  