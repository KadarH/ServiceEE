<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="float: left;">
	<div>
		<div>
			<ul class="nav nav-tabs nav-stacked menu2 ">
				<li><a href="#"
					onclick="document.getElementById('formHome').submit();"
					class="w3-margin w3-light-blue">Acceuil </a></li>
				<li><a href="#"
					onclick="document.getElementById('formProfil').submit();"
					class="w3-margin  w3-light-blue">Mon Profil </a></li>
				<li><a href="#"
					onclick="document.getElementById('formRendezVous').submit();"
					class="w3-margin  w3-light-blue">Les Rendez-vous </a></li>
				<li><a href="#"
					onclick="document.getElementById('formEntretien').submit();"
					class="w3-margin  w3-light-blue">Les Entretiens</a></li>

			</ul>
		</div>
	</div>
</div>





<s:hidden>
	<form action="goToRendezVousResponsable" id="formRendezVous"></form>
	<form action="goToEntretienResponsable" id="formEntretien"></form>
	<form action="goToProfil" id="formProfil"></form>
	<form action="goToHomeResponsable" id="formHome"></form>

</s:hidden>

