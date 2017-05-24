<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="includeResp/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		<div class="w3-animate-zoom  w3-light-grey">
			<jsp:include page="includeResp/menu.jsp" />
		</div>
		<div class=" homing contact_tab w3-card-12 w3-animate-bottom">

			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Information sur l'evaluation de l'objectif :" />


				<div id="ttwo" style="overflow: scroll;">

					<p><s:property value="objectif.label"  /></p>
					<p><s:property value="evaluation.label"  /></p>
					<p><s:property value="evaluation.note"  /></p>
					

				</div>
			</sj:tabbedpanel>

		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
