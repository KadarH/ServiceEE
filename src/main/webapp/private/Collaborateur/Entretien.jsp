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
		<div class="w3-animate-zoom  w3-light-grey ">
			<jsp:include page="includeColl/menu.jsp" />
		</div>
		<div id="divdt" class=" homing contact_tab w3-card-12 w3-animate-bottom">

			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Liste de mes entretiens" />

				
				<div id="ttwo" style="overflow: scroll;height:350px;margin-left:60px;">

					<d:table name="listEntretien" export="false"  style="html" 
					decorator="com.web.collaborateur.decorator.CollaborateurEntretienDecorator"
						requestURI="/private/Collaborateur/listEntretien" pagesize="30">
						<d:column property="responsable.username" title="Pseudo du Responsable"></d:column>
						<d:column property="responsable.email" title="Email"></d:column>
						<d:column property="dateEntretien" title="Date de l'entretien" />
						<d:column property="label" title="Description " />
						<d:column property="aj" title="Action"></d:column>
					</d:table>


				</div>
			</sj:tabbedpanel>

		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
