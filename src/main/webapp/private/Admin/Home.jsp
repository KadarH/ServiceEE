<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/private/include/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		<div class="w3-animate-zoom w3-light-grey">
			<jsp:include page="includeAdmin/menu.jsp" />
		</div>



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">
			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab2" target="ttwo" onclick="action" label="Acceuil Admin" />


				<div id="ttwo"
					style="overflow: scroll; height: 350px; margin-left: 60px;">

					<p>Cette page vous concerne en tant que administrateur , vous
						auriez un menu qui vous donnera les possibilités suivantes :</p>
					<br>
					<li>Acceder à la liste de vos entretiens .</li>
					<li>Acceder aux informations concernant chaque entretien .</li>
					<li>Acceder à la liste des collaborateurs .</li>
					<li>Acceder aux informations concernant chaque collaborateur .</li>
					<li>Acceder à la liste des responsables .</li>
					<li>Acceder aux informations concernant chaque responsable .</li>

				</div>
			</sj:tabbedpanel>


		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
