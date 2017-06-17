<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/include/headerColl.jsp" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		<div class="w3-animate-zoom  w3-light-grey">
			<jsp:include page="includeAdmin/menu.jsp" />
		</div>
		<div id="divdt"
			class=" homing contact_tab w3-card-12 w3-animate-bottom">

			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Information sur l'evaluation de l'objectif :" />


				<div id="ttwo" style="overflow: scroll; height: 350px;">
					<div style="display: flex;">
						<h2 style="margin-right: 400px;">Statistiques de l'objectif :</h2>

						
					</div>

					<p class="w3-card-4 w3-margin w3-padding w3-annimate-left">
						<s:label>Description de l'objectif : </s:label>
						<s:property value="objectif.label" />
					</p>
					<p class="w3-card-4 w3-margin w3-padding w3-annimate-left">
						<s:label>Delai de réalisation : </s:label>
						<s:property value="objectif.delaiRealisation" />
					</p>
					<p class="w3-card-4 w3-margin w3-padding w3-annimate-left">
						<s:label>Condition de reùssite : </s:label>
						<s:property value="objectif.conditionReussite" />
					</p>
					<p class="w3-card-4 w3-margin w3-padding w3-annimate-left">
						<s:label>Etat de l'objectif : </s:label>
						<s:property value="objectif.etat" />
					</p>

				</div>
			</sj:tabbedpanel>


		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
