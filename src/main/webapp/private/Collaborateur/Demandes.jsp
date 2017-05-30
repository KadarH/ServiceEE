<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="includeColl/headerColl.jsp" flush="true" />
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
					Vous pouvez ajouter un message à votre demande :
					<s:form action="ajouterDemande" namespace="/Collaborateur">
						<s:textfield label="Message " name="demande.message" size="70px"></s:textfield>

						<s:submit value="Demander d'etre responsable"></s:submit>

					</s:form>
					<br>
					<h2>Renseignement</h2>
					Une demande d'etre responsable se traite au maximum en 24 h .<br>
					Si vous rencontrez des problèmes , contactez votre responsable de
					ressource humaine.
				</div>
				
			</sj:tabbedpanel>

		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
