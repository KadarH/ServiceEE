<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/include/headerColl.jsp"/>
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		<div class="w3-animate-zoom  w3-light-grey">
			<jsp:include page="includeColl/menu.jsp" />
		</div>



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab1" target="tone" label="Effectuer une demande" />

				<div id="tone" style="overflow: scroll; align-text: center;">
					Erreur !! <br>
					<h2>Renseignement de l'erreur</h2>
					Vous Avez dejà envoyer une demande d'etre responsable , si vous
					n'avez pas reçu de reponse , veuillez concater votre responsable en
					ressource humaine
				</div>

			</sj:tabbedpanel>

		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
