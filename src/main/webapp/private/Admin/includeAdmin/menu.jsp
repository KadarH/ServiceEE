<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


	  <div  style="float:left;">
	<div>
		<div class="w3-padding">
			<ul class="nav nav-tabs nav-stacked menu2 "> 
				<li><a href="#" onclick="document.getElementById('form').submit();"   class="w3-margin w3-light-blue" >Home </a></li>
				<li><a href="#" onclick="document.getElementById('formDemande').submit();"  class="w3-margin w3-light-blue">Demandes </a></li>
				<li><a href="#" onclick="document.getElementById('formEntretien').submit();" class="w3-margin w3-light-blue">Entretiens </a></li>
				<li><a href="#" onclick="document.getElementById('formColl').submit();" class="w3-margin w3-light-blue" >Collaborateurs</a></li>
				<li><a href="#" onclick="document.getElementById('formResp').submit();" class="w3-margin w3-light-blue" >Responsables</a></li>
				
			</ul>
		</div>
	</div></div>
	



<s:hidden>
<form action="goToHomeAdmin" id="form" >


</form>
<form action="goToAdminDemande" id="formDemande" >


</form>
<form action="goToAdminEntretien" id="formEntretien">


</form>
<form action="goToCollaborateurs" id="formColl">


</form>
<form action="goToResponsables" id="formResp">


</form>

</s:hidden>

