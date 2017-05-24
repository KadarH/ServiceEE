<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/pages/Responsable/includeResp/headerResp.jsp"
	flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity w3-padding">

	<div style="display: flex;">
		<div class="w3-animate-zoom  w3-light-grey">
			<jsp:include page="/pages/Responsable/includeResp/menu.jsp" />
		</div>

		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">

		
				<sj:tabbedpanel id="localtabs" cssStyle="max-height:450px">
					<sj:tab id="tab1" target="tone" label="Ajouter un entretien" />
					<sj:tab id="tab2" target="ttwo" onclick="action"
						label="Liste de mes entretiens" />

					<sj:tab id="tab3" target="tthree" onclick="action"
						label="Ajouter une evaluation" />

					<sj:tab id="tab4" target="tthree" onclick="action"
						label="Liste de mes Evaluation" />

					<div id="tone" style="overflow: scroll; align-text: center;">
						Vous pouvez ajouter un entretien d'evaluation :
						<s:form action="">
							<br>

							<s:label>Date d'entretien  : </s:label>
							<sj:datepicker name="e.dateE" parentTheme="simple" zindex="2006"
								timepicker="true" changeYear="true" displayFormat="dd/mm/yy"
								timepickerFormat="HH:mm" timepickerShowSecond="true"
								duration="fast" readonly="true" required="true"></sj:datepicker>

							<s:textfield label="Titre" name="e.titre"></s:textfield>
							<s:select list="#{'tiw':'tiw','alpha':'alpha','beta':'beta' }"
								label="Collabrorateur à evaluer"></s:select>
							<s:submit value="Ajouter"></s:submit>

						</s:form>

					</div>

					<div id="ttwo" style="overflow: scroll;">
						<div>
							<h2>Mes entretiens en tant que collaborateur :</h2>
							<d:table name="listEntretienColl" export="true"
								requestURI="/listAction" pagesize="20">
								<d:column property="id" title="ISBN" />
								<d:column property="Message" title="Titre" />
								<d:column property="Etat" title="Description" />
							</d:table>
						</div>


						<div>
							<h2>Mes entretiens en tant que responsable:</h2>

							<d:table name="listEntretienRes" export="true"
								requestURI="/listAction" pagesize="20">
								<d:column property="id" title="ISBN" />
								<d:column property="Message" title="Titre" />
								<d:column property="Etat" title="Description" />
							</d:table>

						</div>
					</div>
					<div id="tthree" style="overflow: scroll; align-text: center;">
						Vous pouvez ajouter un entretien d'evaluation :
						<s:form>
							<br>

							<s:label>Date d'entretien  : </s:label>
							<sj:datepicker name="e.dateE" parentTheme="simple" zindex="2006"
								timepicker="true" changeYear="true" displayFormat="dd/mm/yy"
								timepickerFormat="HH:mm" timepickerShowSecond="true"
								duration="fast" readonly="true" required="true"></sj:datepicker>

							<s:textfield label="Titre" name="e.titre"></s:textfield>
							<s:select list="#{'tiw':'tiw','alpha':'alpha','beta':'beta' }"
								label="Collabrorateur à evaluer"></s:select>
							<s:submit value="Ajouter"></s:submit>

						</s:form>

					</div>
				</sj:tabbedpanel>
				</div>

	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
