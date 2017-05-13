<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<jsp:include page="includeColl/headerColl.jsp" flush="true" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/w3.css" />
<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href="/ServiceEE/css/Style.css" />

<div class="w3-card-12 w3-blue-grey w3-animate-opacity">

	<div style="display: flex;">
		<div class="w3-animate-zoom w3-light-grey">
			<jsp:include page="includeColl/menu.jsp" />
		</div>



		<div class=" homing contact_tab w3-card-12  w3-animate-bottom">



			<sj:tabbedpanel id="localtabs" >
				<sj:tab id="tab1" target="tone" label="Ajouter un rendez-vous" />
				<sj:tab id="tab2" target="ttwo" onclick="action" label="Liste de rendez vous" />
				
				<div id="tone">Mauris mauris ante, blandit et, ultrices a,
					suscipit eget, quam. Integer ut neque. Vivamus nisi metus, molestie
					vel, gravida in, condimentum sit amet, nunc. Nam a nibh. Donec
					suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur
					malesuada. Vestibulum a velit eu ante scelerisque vulputate.</div>
				<div id="ttwo">Sed non urna. Donec et ante. Phasellus eu
					ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at
					aliquet laoreet, mauris turpis porttitor velit, faucibus interdum
					tellus libero ac justo. Vivamus non quam. In suscipit faucibus
					urna.</div>
				
			</sj:tabbedpanel>




		</div>



	</div>

	<!-- end of column four -->
</div>
<jsp:include page="/pages/include/footer.jsp" />
