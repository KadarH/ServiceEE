<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


	  <div  style="float: left;">
	<div>
		<div >
			<ul class="nav nav-tabs nav-stacked menu2 w3-card-12"> 
				<li><a href="/ServiceEE/private/Admin/Home.jsp"   class="w3-margin">Home </a></li>
				<li><a href="#" onclick="document.getElementById('formDemande').submit();"  class="w3-margin">Demandes </a></li>
				<li><a href="#" onclick="document.getElementById('formEntretien').submit();" class="w3-margin">Entretiens </a></li>
				<li><a href="#" onclick="document.getElementById('formColl').submit();" class="w3-margin" >Collaborateurs</a></li>
				<li><a href="#" onclick="document.getElementById('formResp').submit();" class="w3-margin" >Responsables</a></li>
				
			</ul>
		</div>
	</div></div>
	




<s:hidden>
<form action="goToAdminDemande" id="formDemande" >


</form>
<form action="goToAdminEntretien" id="formEntretien">


</form>
<form action="goToCollaborateurs" id="formColl">


</form>
<form action="goToResponsables" id="formResp">


</form>

</s:hidden>

