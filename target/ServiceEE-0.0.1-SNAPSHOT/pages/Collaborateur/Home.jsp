<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="includeColl/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display:flex;" >
		<div class="w3-animate-zoom w3-light-grey">
		<jsp:include page="includeColl/menu.jsp"  />		
		</div>



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">
		<br>
		<p>Cette page vous concerne en tant que collaborateur , vous auriez un menu qui vous donnera les possibilités suivantes : </p>
		<br>
		<li>Demander un rendez vous .</li>
		<li>Effectuer une demande pour etre responsable .</li>
		<li>Acceder à la liste de vos entretiens .</li>
		<li>Acceder aux informations concernant chaque entretien .</li>
		
			
		</div>
		
		

		</div>
	
	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
