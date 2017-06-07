<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="/private/include/headerColl.jsp"/>

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		<div class="w3-animate-zoom w3-light-grey">
			<jsp:include page="includeAdmin/menu.jsp" />
		</div>



		<div id="divdt"
			class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs">
				<sj:tab id="tab1" target="tone" label="Liste des Demandes d'ajout" />
				<sj:tab id="tab2" target="ttwo" onclick="action"
					label="Liste des demandes pour être responsable" />

				<div id="tone" style="overflow-y: scroll; height: 350px;">


					<d:table name="listDemandeAjout" export="true" id="appStatus"
						decorator="com.web.admin.AdminActionDecorator"
						requestURI="/private/Admin/listDemandeAjout" pagesize="30">
						<d:column property="user.username" title="Pseudo"></d:column>
						<d:column property="user.email" title="Email"></d:column>
						<d:column property="message" title="Message" />
						<d:column property="date" title="Date " />
						<d:column property="aj" title="Accepter">
						</d:column>
					</d:table>

				</div>
				<div id="ttwo" style="overflow-y: scroll; height: 350px;">

					<d:table name="listDemandeResp" export="true" id="appStatus"
						decorator="com.web.admin.AdminRActionDecorator"
						requestURI="/private/Admin/listDemandeResp" pagesize="30">
						<d:column property="user.username" title="Pseudo"></d:column>
						<d:column property="user.email" title="Email"></d:column>
						<d:column property="message" title="Message" />
						<d:column property="date" title="Date " />
						<d:column property="aj" title="Accepter">
						</d:column>
					</d:table>



				</div>


			</sj:tabbedpanel>



		</div>



	</div>

	<!-- end of column four -->
</div>

<jsp:include page="/private/include/footer.jsp" />
