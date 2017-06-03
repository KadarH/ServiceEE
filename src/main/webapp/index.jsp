<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/public/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">



		<div class=" w3-card-24 contact_tab  w3-white w3-animate-bottom w3-panel w3-hover-border-green  w3-round-xlarge"
			style="width: 400px; margin-left: 200px">




			<div id="tone" style="padding: 10px 0px; align-text: center;">
				<div class=" w3-margin w3-padding w3-animate-zoom">
					<img alt="login" src="/ServiceEE/img/login-button.png" height="100px"
						width="350px">
				</div>
				<div style="padding: 15px 20px; align-text: center;">
					<s:form action="/private/goToHome" cssClass="">
						<s:textfield label="Email" name="user.email"
							cssClass="w3-margin-bottom"></s:textfield>
						<s:password label="Password" name="user.password"
							cssClass="w3-margin-bottom"></s:password>

						<s:submit
							cssClass="w3-btn w3-green w3-card-12 w3-padding-12 w3-margin w3-xxlarge w3-centered"
							value="Se connecter"></s:submit>

					</s:form>
				</div>


			</div>
		</div>

		<div class=" w3-card-24 contact_tab  w3-white w3-animate-bottom w3-panel w3-hover-border-green  w3-round-xlarge"
			style="width: 400px; margin-left: 100px">




			<div id="tone" style="padding: 10px 0px; align-text: center;">
				<div class=" w3-margin w3-padding w3-animate-zoom">
					<img alt="register" src="/ServiceEE/img/signup.jpeg" height="100px"
						width="330px">
				</div>
				<div style="padding: 15px 20px; align-text: center;">
					<s:form action="/private/addColl" cssClass="">
						<s:textfield label="Username" name="user.username" ></s:textfield>
						<s:textfield label="Email" name="user.email" ></s:textfield>
						<s:password label="Password" name="user.password"></s:password>
						<s:submit
							cssClass="w3-btn w3-green w3-card-12 w3-margin  w3-xxlarge w3-centered"
							value="S ' inscrire"></s:submit>

					</s:form>
				</div>
			</div>
		</div>
	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/private/include/footer.jsp" />
