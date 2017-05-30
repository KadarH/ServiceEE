<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="includeResp/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/styles/displaytag.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		<div class="w3-animate-zoom  w3-light-grey">
			<jsp:include page="includeResp/menu.jsp" />
		</div>
		<div class=" homing contact_tab w3-card-12 w3-animate-bottom">

			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Liste des objectifs" />
						
				
				<div id="ttwo" style="overflow: scroll;height: 350px;">

					<d:table name="listObjectif" export="true" style="html" cellspacing="30px"
					decorator="com.web.responsable.CollaborateurObjectifDecorator"
						requestURI="/listAction" pagesize="30">
						<d:column property="label" title="Description "></d:column>
						<d:column property="etat" title="Etat "></d:column>
						<d:column property="delaiRealisation" title="Delai de realisation"></d:column>
						<d:column property="conditionReussite" title="Condition de reussite"></d:column>
						<d:column property="aj" title="Show Evaluation"></d:column>
					</d:table>


				</div>
			</sj:tabbedpanel>

		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
