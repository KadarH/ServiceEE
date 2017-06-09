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
			<jsp:include page="/private/Responsable/includeResp/menu.jsp" />
		</div>

		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">


			<sj:tabbedpanel id="localtabs" cssStyle="max-height:400px">
				<sj:tab id="tab1" target="tone" label="Ajouter une evaluation" />
				<div id="tone" style="overflow: scroll; align-text: center;">
				
					<s:form namespace="/private/Responsable" action="ajouterEvaluation">
						<s:textfield label="Cible Visée" name="evaluation.cibleVisee"
							size="70px" required="true"></s:textfield>
						<s:textfield label="Description " name="evaluation.label"
							size="60px" ></s:textfield>
						<s:textfield label="Note :" name="evaluation.note"
							size="20px" required="true"></s:textfield>
						
							<s:textfield label="Resultat De l'année Ecoulée" name="evaluation.resultatAnnee"
							size="40px" required="true"></s:textfield>
						
						<s:submit value="Ajouter Evaluation"></s:submit>

					</s:form>
					
				</div>
				
			</sj:tabbedpanel>
		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
