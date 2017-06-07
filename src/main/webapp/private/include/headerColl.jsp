<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/styles/displaytag.css" />


<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />




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
li



 



a






:hover






:not



 



(
.active



 



)
{
background-color






:



 



#555






;
color






:



 



white






;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$.subscribe('autocompleteChange', function(event, data) {
			var ui = event.originalEvent.ui;
			if (ui.item) {
				var message = ui.item.value;
				if (ui.item.key) {
					message = '( ' + ui.item.key + ' ) ' + message;
				}
				$('#topics').html('<b>' + message + '</b>');
			}
		});

		$.subscribe('autocompleteFocus', function(event, data) {
			var ui = event.originalEvent.ui;
			var message = ui.item.value;
			if (ui.item.key) {
				message = '( ' + ui.item.key + ' ) ' + message;
			}
			$('#topics').html('<u>' + message + '</u>');
		});

		$.subscribe('autocompleteSelect', function(event, data) {
			var ui = event.originalEvent.ui;
			var message = ui.item.value;
			if (ui.item.key) {
				message = '( ' + ui.item.key + ' ) ' + message;
			}
			$('#topics').html('<i>' + message + '</i>');
		});
	});
</script>
<title>page d'inscription</title>


</head>
<body class="w3-light-grey" style="color: black">

	<div style="margin-bottom: 2%; text-align: center">
		<div style="float: left">

			<p class="w3-animate-zoom w3-margin w3-light-grey  ">
				<a href="#"><img src="/ServiceEE/img/interview.png" alt="header"
					height="100px" width="158px" /></a>
			</p>
		</div>
		<div>
			<p class="w3-myfont ">
				<span class="w3-tag w3-jumbo w3-theme-l3 w3-hover-light-blue">M</span>
				<span class="w3-tag w3-jumbo w3-theme-l2 w3-hover-light-blue">Y</span>
				<span class="w3-tag w3-jumbo ">
				 </span> <span
					class="w3-tag w3-jumbo "> </span> <span
					class="w3-tag w3-jumbo w3-theme-l3 w3-hover-light-blue">I</span> <span
					class="w3-tag w3-jumbo w3-theme-l2 w3-hover-light-blue">N</span> <span
					class="w3-tag w3-jumbo w3-theme-l1 w3-hover-light-blue">T</span> <span
					class="w3-tag w3-jumbo w3-theme w3-hover-light-blue">E</span> <span
					class="w3-tag w3-jumbo w3-theme-d1 w3-hover-light-blue">R</span> <span
					class="w3-tag w3-jumbo w3-theme-d2 w3-hover-light-blue">V</span> <span
					class="w3-tag w3-jumbo w3-theme-d1 w3-hover-light-blue">I</span> <span
					class="w3-tag w3-jumbo w3-theme w3-hover-light-blue">E</span> <span
					class="w3-tag w3-jumbo w3-theme-l1 w3-hover-light-blue">W</span> <span
					class="w3-tag w3-jumbo w3-theme-l2 w3-hover-light-blue">E</span> <span
					class="w3-tag w3-jumbo w3-theme-l3 w3-hover-light-blue">R</span>
			</p>
		</div>
	</div>

	<div style="display: flex;" class="w3-myfont w3-card-4 w3-light-blue">
		<div style="margin-left: 15%" class="w3-hover-blue w3-padding ">
			<a href="#">Page d'acceuil</a>
		</div>
		<div style="margin-left: 15%" class="w3-hover-blue w3-padding">
			<a href="#">Page d'aide</a>
		</div>
		<div style="margin-left: 15%" class="w3-hover-blue w3-padding">
			<a href="#" onclick="document.getElementById('logoutform').submit();">Se
				Deconnecter</a>
		</div>

		<s:form action="/logout" id="logoutform"></s:form>

	</div>