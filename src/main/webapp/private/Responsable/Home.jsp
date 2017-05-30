<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/pages/Responsable/includeResp/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey  w3-animate-opacity">

	<div style="display:flex;" >
		<div class="w3-animate-zoom  w3-light-grey">
		<jsp:include page="includeResp/menu.jsp"  />		
		</div>



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">
		<br>
		<p>Cette page vous concerne en tant que Responsable , vous auriez un menu qui vous donnera les possibilités suivantes : </p>
		<br>
		<li>Demander un rendez vous .</li>
		<li>Confirmer un rendez-vous</li>
		<li>Ajouter un entretien concernant un collaborateur + fixer les objectifs .</li>
		<li>Ajouter une evaluation concernant un collaborateur</li>
		<li>Acceder à la liste de vos entretiens en tant que collaborateur .</li>
		<li>Acceder à la liste de vos entretiens en tant que responsable .</li>
		<li>Acceder à la liste de vos evaluations en tant que collaborateur .</li>
		<li>Acceder à la liste de vos evaluations en tant que responsable .</li>
		
			
		</div>
		
		

		</div>
	
	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
