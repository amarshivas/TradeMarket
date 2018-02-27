<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<p>Sponsored Links</p>
       <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
	   <c:forEach items="${sponsoredLinksList}" var="sponsoredLinksListVar">
	   <div class="panel panel-default">
                           <div class="panel-heading" role="tab" id="headingOne">
                              <h4 class="panel-title asd">
                                 <a class="pa_italic" role="button" data-toggle="collapse" data-parent="#accordion" href="https://p.w3layouts.com/demos/sep-2016/15-09-2016/trade_market/web/index.html#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                 <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span><i class="glyphicon glyphicon-menu-up" aria-hidden="true"></i>${sponsoredLinksListVar.sponsored_Name}
                                 </a>
                              </h4>
                           </div>
                           <div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne" aria-expanded="false" style="height: 0px;">
                              <div class="panel-body panel_text">
                                 ${sponsoredLinksListVar.sponsored_Discription}.
                              </div>
                           </div>
                        </div>
						</c:forEach>
                   </div>
                  