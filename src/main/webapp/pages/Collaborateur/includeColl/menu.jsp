<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="float: left;">
	<div>
		<div>
			<ul class="nav nav-tabs nav-stacked menu2 w3-card-12">
				<li><a href="#"
					onclick="document.getElementById('formDemande').submit();"
					class="w3-margin">Mes Demandes </a></li>
				<li><a href="#"
					onclick="document.getElementById('formRendezVous').submit();"
					class="w3-margin">Mes Rendez - vous </a></li>
				<li><a href="#"
					onclick="document.getElementById('formEntretien').submit();"
					class="w3-margin">Mes Entretiens</a></li>
				<li><a href="#"
					onclick="document.getElementById('formProfil').submit();"
					class="w3-margin">Mes Informations</a></li>

			</ul>
		</div>
	</div>
</div>



<s:hidden>


<s:form action="goToDemande"  id="formDemande"></s:form>
<s:form action="goToRendezVous"  id="formRendezVous"></s:form>
<s:form action="goToEntretien"  id="formEntretien"></s:form>
<s:form action="goToProfil"  id="formProfil"></s:form>
	

</s:hidden>

