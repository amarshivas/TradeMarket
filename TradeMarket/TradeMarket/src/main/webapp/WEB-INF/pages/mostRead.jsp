<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<ol class="w3_tab_list_mostread">
	<c:forEach items="${listMostRead}" var="listMostReadVar">
   		<li><span><fmt:formatDate type="both" pattern="HH:mm"
    value="${listMostReadVar.news_Createddate}" /></span> 
   			<a href="">${listMostReadVar.newsDisplayName}</a>
   		</li>
   	</c:forEach>
</ol>