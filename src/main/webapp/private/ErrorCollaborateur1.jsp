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

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">
			<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Demande d'ajout n'est pas encore confirmée" />


				<div id="ttwo"
					style="overflow: scroll; height: 350px; margin-left: 60px;">
					<h1>Problème de connexion</h1>
					<br>
					<p>Vous êtes inscrit en tant que collaborateur , Veuillez alors
						attendre la confirmation de votre demande d'ajout par
						l'administrateur</p>
					<br>
					<p>Si votre demande n'a pas été confirmer d'ici 24 heure , Veuillez contacter votre responsable en ressource humaine </p>
					
				</div>
			</sj:tabbedpanel>
		</div>
		<!-- end of column four -->
	</div>
</div>
<jsp:include page="/private/include/footer.jsp" />
