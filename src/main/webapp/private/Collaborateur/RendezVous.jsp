<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/include/headerColl.jsp" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		<div class="w3-animate-zoom w3-light-grey w3-padding">
			<jsp:include page="includeColl/menu.jsp" />
		</div>



		<div id="divdt"
			class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs">
				<sj:tab id="tab1" target="tone" label="Ajouter un rendez-vous" />
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Liste de rendez vous" />
				<sj:tab id="tab3" target="tthree" onclick="action"
					label="Liste des rendez vous àcceptés" />

				<div id="tone" style="overflow-y: scroll; height: 350px;"
					class="w3-padding">
					Vous pouvez ajouter un message à votre demande de rendez-vous : <br />
					<s:form action="ajouterRendezVous" namespace="/private/Collaborateur" cssClass=" w3-border-0">
						<s:label value="Date Rendez Vous"></s:label>
						<sj:datepicker name="rendezVous.dateRendezVous" zindex="2006"
							timepicker="true" changeYear="true" displayFormat="dd/mm/yy"
							timepickerFormat="HH:mm" timepickerShowSecond="true"
							minDate="<%new Date();%>" duration="fast" readonly="true"
							required="true" size=" 90px"></sj:datepicker>
						<s:label value="Objectif du rendez Vous"></s:label>

						<s:textfield name="rendezVous.message" size="110px"></s:textfield>
						<s:label value="Choisissez à qui vous demandez ce rendez-vous"></s:label>
						<sj:autocompleter id="languages" name="x" list="listCollaborateur"
							required="true" selectBox="true" selectBoxIcon="true"
							onChangeTopics="autocompleteChange"
							onFocusTopics="autocompleteFocus"
							onSelectTopics="autocompleteSelect" size="110px" />
						<s:submit value="Demander un Rendez-vous"
							cssClass="w3-centered w3-button w3-light-blue w3-xlarge w3-animate-zoom w3-card-12"></s:submit>

					</s:form>
					
					<div style="display: flex; width: 300px; margin-bottom: 30px;"
						class=" w3-card-4   ">
						
						<img alt="!" src="/ServiceEE/img/attention.jpeg" height="65px"
							width="65px" class="w3-animate-fading">
						<h2 class=" w3-margin-left ">Renseignement</h2>
						
					</div>
					
					<div >
					<p>Un rendez vous sera dans l'etat "false" , jusqu'à ce qu'il se
					validera par l'utilisateur demandé .</p>
					</div>

				</div>
				<div id="ttwo" style="overflow-y: scroll; height: 350px;">

					<d:table name="listRendezVous" export="false" id="appStatus"
						decorator="com.web.collaborateur.decorator.CollaborateurActionDecorator"
						requestURI="/private/Collaborateur/listRendezVous" pagesize="30">
						<d:column property="userdem.username" title="Pseudo"></d:column>
						<d:column property="message" title="Objectif" />
						<d:column property="dateRendezVous" title="Date " />
						<d:column property="aj" title="Action">
						</d:column>
					</d:table>


				</div>
				<div id="tthree" style="overflow-y: scroll; height: 350px;">

					<d:table name="listRendezVousAcceptee" export="false" id="appStatus"
						cellpadding="100px"
						requestURI="/private/Collaborateur/listRendezVousAcceptee"
						pagesize="30">
						<d:column property="userdem.username" title="Pseudo"></d:column>
						<d:column property="message" title="Objectif" />
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
