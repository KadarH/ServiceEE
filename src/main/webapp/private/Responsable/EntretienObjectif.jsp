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
				<sj:tab id="tab1" target="tone" label="Ajouter un objectif" />
				<div id="tone" style="overflow: scroll; align-text: center;">
				<h2>Renseignement</h2>
					Vous pouvez ajouter plusieurs objectifs au même entretien 
				
					ajouter un objectif / mission : <br />
					<s:form namespace="/private/Responsable" action="ajouterObjectifEntretien">
						<s:textfield label="Mission " name="objectif.label"
							size="70px"></s:textfield>
						
						<sj:datepicker name="objectif.delaiRealisation" zindex="2006"
							timepicker="true" changeYear="true" displayFormat="dd/mm/yy"
							timepickerFormat="HH:mm" timepickerShowSecond="true"
							duration="fast" readonly="true" required="true"
							label="Delai de Realisation"></sj:datepicker>

						<s:textfield label="Condition de reussite" name="objectif.conditionReussite"
							size="70px"></s:textfield>
						<s:textfield label="Indicateur" name="objectif.indicateur"
							size="70px"></s:textfield>
						
						<s:submit value="Ajouter l'objectif"></s:submit>

					</s:form>
					
				</div>
				
			</sj:tabbedpanel>
		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
