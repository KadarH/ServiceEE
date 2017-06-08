<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/include/headerColl.jsp"/>
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		<div class="w3-animate-zoom w3-light-grey">
			<jsp:include page="includeColl/menu.jsp" />
		</div>



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs">
				<sj:tab id="tab1" target="tone" label="Information Personnelles :" />
				
				<div id="tone">


					<s:form action="modifierProfil">
						<s:textfield label="Nom"  name="user.nom" size="70px" required="true"></s:textfield>
						<s:textfield label="Prenom" name="user.prenom" size="70px" required="true"></s:textfield>
						<s:textfield label="Adresse" name="user.adresse" size="70px"></s:textfield>
						<s:textfield label="Pseudo" name="user.username" size="70px" required="true"></s:textfield>
						
						<s:submit value="Modifier mon profil"></s:submit>

					</s:form>
				</div>
				
			</sj:tabbedpanel>




		</div>



	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
