
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/pages/include/header.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	


		<div class=" registring contact_tab w3-card-12  w3-animate-bottom">
			<h2>Inscription</h2>

			<s:form action="registerColl" method="POST">
				<s:textfield label="Nom" name="c.nom" />
				<s:textfield label="Prenom" name="c.prenom" />
				<s:textfield label="Email" name="c.email" />
				<s:textfield label="N Tel" name="c.nTel" />
				<s:textfield label="Adresse " name="c.adresse" />
				<s:textfield label="Profession " name="c.profession" />
				<sj:datepicker name="c.dateNaissance" maxDate="-1d"
					displayFormat="dd/mm/y" label="Date de Naissance" />
				<sj:autocompleter id="departement" name="c.departement"
					list="#{'Reseau':'Reseau','Developpement':'Developpement','Design':'Design' }"
					label="Departement" />
				<s:submit value="Valider" cssClass="btn btn-primary" />

			</s:form>
		</div>
		
		

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
