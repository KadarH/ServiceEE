<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/include/headerColl.jsp" />
<head>
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/styles/displaytag.css" />

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
</head>
<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		<div class="w3-animate-zoom w3-light-grey">
			<jsp:include page="includeResp/menu.jsp" />
		</div>



		<div id="divdt"
			class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs">
				<sj:tab id="tab1" target="tone" label="Ajouter un rendez-vous" />
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Liste de rendez vous" />
				<sj:tab id="tab3" target="tthree" onclick="action"
					label="Liste des rendez vous àcceptés" />

				<div id="tone">
					Vous pouvez ajouter un message à votre demande de rendez-vous : <br />
					<s:form cssClass="w3-card-12 "
						namespace="/private/Responsable"
						action="ajouterRendezVousResponsable">
						<sj:datepicker name="rendezVous.dateRendezVous" zindex="2006"
							timepicker="true" changeYear="true" displayFormat="dd/mm/yy"
							timepickerFormat="HH:mm" timepickerShowSecond="true"
							duration="fast" readonly="true" required="true"
							label="Date du rendez vous"></sj:datepicker>

						<s:textfield label="Message" name="rendezVous.message"
							size="105px"></s:textfield>
						<sj:autocompleter id="languages" name="x" list="listCollaborateur"
							required="true" selectBox="true" selectBoxIcon="true"
							onChangeTopics="autocompleteChange"
							onFocusTopics="autocompleteFocus"
							onSelectTopics="autocompleteSelect" label="coll" />

						<s:submit value="Declarer un Rendez-vous"></s:submit>

					</s:form>
					<h2>Renseignement</h2>
					Un rendez vous sera dans l'etat "false" , jusqu'à ce qu'il se
					validera par l'utilisateur demandé .

				</div>
				<div id="ttwo" style="overflow-y: scroll; height: 350px;">

					<d:table name="listRendezVous" export="true" style="html"
						decorator="com.web.responsable.decorator.CollaborateurActionDecorator"
						requestURI="/private/Responsable/listRendezVous" pagesize="30">
						<d:column property="userdem.username" title="Pseudo"></d:column>
						<d:column property="message" title="Message" />
						<d:column property="dateRendezVous" title="Date " />
						<d:column property="aj" title="Accepter">
						</d:column>
					</d:table>


				</div>
				<div id="tthree" style="overflow-y: scroll; height: 350px;">

					<d:table name="listRendezVousAcceptee" export="true" style="html"
						requestURI="/private/Responsable/listRendezVousAcceptee"
						pagesize="30">
						<d:column property="userdem.username" title="Pseudo"></d:column>
						<d:column property="message" title="Message" />
						<d:column property="dateRendezVous" title="Date " />
						<d:column title="Accepté">
							<img width="40" height="40" src="/ServiceEE/img/accepter.png">
						</d:column>
					</d:table>


				</div>

			</sj:tabbedpanel>



		</div>



	</div>

	<!-- end of column four -->
</div>

<jsp:include page="/private/include/footer.jsp" />
