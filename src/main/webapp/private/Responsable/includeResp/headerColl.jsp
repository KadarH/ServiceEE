<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/styles/displaytag.css");%> />


<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/css/w3.css");%>  />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/css/Style.css");%>  />
	

<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/Exercice6/styles/bootstrap.css");%> />





<sj:head jquerytheme="redmond" />

<style type="text/css">
.errors {
	background-color: #FFCCCC;
	border: 1px solid #CC0000;
	width: 500px;
	margin-bottom: 8px;
}

.errors li {
	list-style: none;
}

.msgok {
	background-color: #DDFFDD;
	border: 1px solid #009900;
	width: 500px;
}

.msgok li {
	list-style: none;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	background-color: #f1f1f1;
}

li a {
	display: block;
	color: #000;
	padding: 8px 8px;
	text-decoration: none;
}

li a.active {
	background-color: #4CAF50;
	color: white;
}

li a:hover:not (.active ) {
	background-color: #555;
	color: white;
}
</style>

<title>page d'inscription</title>

</head>
<body style="background-color: black; color: white">

	<div style="margin-bottom: 2%; text-align: center">
		<div style="float: left">

			<p class="w3-animate-zoom w3-margin  w3-card-16 ">
				<img src="/ServiceEE/img/logo1.png" alt="header" height="120px"
					width="158px" />
			</p>
		</div>
		<div>
			<p>
				<br />
			<h1>Service Entretien Evaluation</h1>
			</p>
		</div>
	</div>

	<div style="display: flex;" class="w3-card-4 w3-grey">
		<div style="margin-left: 15%" class="w3-hover-blue w3-padding ">
			<a href="#">Page d'acceuil</a>
		</div>
		<div style="margin-left: 15%" class="w3-hover-blue w3-padding">
			<a href="#">Page d'aide</a>
		</div>
		<div style="margin-left: 15%" class="w3-hover-blue w3-padding">
			<a href="#" onclick="document.getElementById('logoutform').submit();">Se
				deconnecter</a>
		</div>

		<s:form namespace="/private" action="logout" id="logoutform"></s:form>

	</div>