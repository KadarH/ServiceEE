<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/Responsable/includeResp/headerColl.jsp"
	flush="true" />
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
<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		<div class="w3-animate-zoom  w3-light-grey">
			<jsp:include page="/private/Responsable/includeResp/menu.jsp" />
		</div>

		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">


			<sj:tabbedpanel id="localtabs" cssStyle="max-height:400px">
				<sj:tab id="tab1" target="tone" label="Ajouter un entretien" />
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Mes entretiens (Collaborateur)" />

				<sj:tab id="tab3" target="tthree" onclick="action"
					label="Mes entretiens (Responsable)" />

				<div id="tone" style="overflow: scroll; align-text: center;">
					Vous pouvez ajouter un entretien d'evaluation : Vous pouvez ajouter
					un message à votre demande de rendez-vous : <br />
					<s:form namespace="/private/Responsable" action="ajouterEntretienResponsable">
						<sj:datepicker name="entretien.dateEntretien" zindex="2006"
							timepicker="true" changeYear="true" displayFormat="dd/mm/yy"
							timepickerFormat="HH:mm" timepickerShowSecond="true"
							duration="fast" readonly="true" required="true"
							label="Date de l'entretien"></sj:datepicker>

						<s:textfield label="Description" name="entretien.label"
							size="70px"></s:textfield>
						<sj:autocompleter id="languages" name="x" list="listCollaborateur"
							required="true" selectBox="true" selectBoxIcon="true"
							onChangeTopics="autocompleteChange"
							onFocusTopics="autocompleteFocus"
							onSelectTopics="autocompleteSelect" label="Collaborateur" />
						
						<s:submit value="Ajouter l'entretien"></s:submit>

					</s:form>
					<h2>Renseignement</h2>
					Aprés avoir ajouter un entretien , il va falloir completer des
					formulaire en but de definir les objectifs et les missions associés
					à cet entretien .

				</div>

				<div id="ttwo" style="overflow: scroll;height: 350px;">

					<d:table name="listEntretienCollaborateur" export="true"
						style="html" cellspacing="50px"
						decorator="com.web.responsable.CollaborateurEntretienDecorator"
						requestURI="/listAction" pagesize="30">
						<d:column property="responsable.nom" title="Nom du responsable"></d:column>
						<d:column property="responsable.email" title="Email"></d:column>
						<d:column property="dateEntretien" title="Date" />
						<d:column property="label" title="Description " />
						<d:column property="aj" title="Action"></d:column>
					</d:table>


				</div>
				<div id="tthree" style="overflow: scroll; height: 350px;align-text: center;">

					<d:table name="listEntretienResponsable" export="true" style="html"
						cellspacing="50px"
						decorator="com.web.responsable.CollaborateurEntretienDecorator"
						requestURI="/private/Responsable/listEntretienResponsable" pagesize="20">
						<d:column property="responsable.nom" title="Nom du responsable"></d:column>
						<d:column property="responsable.email" title="Email"></d:column>
						<d:column property="dateEntretien" title="Date" />
						<d:column property="label" title="Description " />
						<d:column property="aj" title="Action"></d:column>
					</d:table>

				</div>
			</sj:tabbedpanel>
		</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
