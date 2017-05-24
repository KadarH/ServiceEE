<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/pages/Collaborateur/includeColl/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		


		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab1" target="tone" label="Effectuer une demande" />

				<div id="tone" style="overflow: scroll; align-text: center;">
					
					<s:form action="goToHome">
						<s:textfield label="Email " name="user.email" size="70px"></s:textfield>
						<s:password label="Password" name="user.password" size="70px"></s:password>
						<s:submit value="Log in"></s:submit>

					</s:form>
					
				</div>

			</sj:tabbedpanel>

		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
