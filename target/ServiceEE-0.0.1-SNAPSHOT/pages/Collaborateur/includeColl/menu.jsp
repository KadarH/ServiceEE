<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%
String aut = (String)session.getAttribute("aut");
if(aut.equals("true")){
%>

<div  style="float: left;">
	<div>
		<div >
			<ul class="nav nav-tabs nav-stacked menu2 w3-card-12"> 
				<li><a href="#" onclick="document.getElementById('formRendezVous').submit();" class="w3-margin">Mes Rendez - vous </a></li>
				<li><a href="#" onclick="document.getElementById('formEntretien').submit();" class="w3-margin" >Mes Entretiens</a></li>
				<li><a href="/ServiceEE/pages/Collaborateur/Profil.jsp" class="w3-margin" >Mes Informations</a></li>
				
			</ul>
		</div>
	</div>
</div>


<%} else if(aut.equals("false")){
	
	%>
	  <div  style="float: left;">
	<div>
		<div >
			<ul class="nav nav-tabs nav-stacked menu2 w3-card-12"> 
				<li><a href="/ServiceEE/pages/Collaborateur/Demandes.jsp" class="w3-margin">Mes Demandes </a></li>
				<li><a href="#" onclick="document.getElementById('formRendezVous').submit();" class="w3-margin">Mes Rendez - vous </a></li>
				<li><a href="#" onclick="document.getElementById('formEntretien').submit();" class="w3-margin" >Mes Entretiens</a></li>
				<li><a href="/ServiceEE/pages/Collaborateur/Profil.jsp" class="w3-margin" >Mes Informations</a></li>
				
			</ul>
		</div>
	</div></div>
	
	<%
	
	
	}%>





<s:hidden>
<form action="goToRendezVous" id="formRendezVous" >


</form>
<form action="goToEntretien" id="formEntretien">


</form>

</s:hidden>

