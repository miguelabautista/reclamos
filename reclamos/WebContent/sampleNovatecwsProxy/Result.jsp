<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleNovatecwsProxyid" scope="session" class="ve.com.novatec.www.novatecws.NovatecwsProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleNovatecwsProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleNovatecwsProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleNovatecwsProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ve.com.novatec.www.novatecws.Novatecws_PortType getNovatecws_PortType10mtemp = sampleNovatecwsProxyid.getNovatecws_PortType();
if(getNovatecws_PortType10mtemp == null){
%>
<%=getNovatecws_PortType10mtemp %>
<%
}else{
        if(getNovatecws_PortType10mtemp!= null){
        String tempreturnp11 = getNovatecws_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String portDocPath_3id=  request.getParameter("portDocPath22");
        int portDocPath_3idTemp  = Integer.parseInt(portDocPath_3id);
        String hostDocPath_4id=  request.getParameter("hostDocPath24");
            java.lang.String hostDocPath_4idTemp = null;
        if(!hostDocPath_4id.equals("")){
         hostDocPath_4idTemp  = hostDocPath_4id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_2id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_2id.setPortDocPath(portDocPath_3idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_2id.setHostDocPath(hostDocPath_4idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1CheckRequest_1id" scope="session" class="ve.com.novatec.www.novatecws.CheckRequest" />
        <%
        ve1com1novatec1www1novatecws1CheckRequest_1id.setDpServicesConnectionDTO(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_2id);
        ve.com.novatec.www.novatecws.CheckResponse check13mtemp = sampleNovatecwsProxyid.check(ve1com1novatec1www1novatecws1CheckRequest_1id);
if(check13mtemp == null){
%>
<%=check13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dpServicesConnection:</TD>
<TD>
<%
if(check13mtemp != null){
%>
<%=check13mtemp.isDpServicesConnection()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 26:
        gotMethod = true;
        String subFolders_6id=  request.getParameter("subFolders33");
        boolean subFolders_6idTemp  = Boolean.valueOf(subFolders_6id).booleanValue();
        String portDocPath_8id=  request.getParameter("portDocPath37");
        int portDocPath_8idTemp  = Integer.parseInt(portDocPath_8id);
        String hostDocPath_9id=  request.getParameter("hostDocPath39");
            java.lang.String hostDocPath_9idTemp = null;
        if(!hostDocPath_9id.equals("")){
         hostDocPath_9idTemp  = hostDocPath_9id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_7id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_7id.setPortDocPath(portDocPath_8idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_7id.setHostDocPath(hostDocPath_9idTemp);
        String maxDocs_10id=  request.getParameter("maxDocs41");
        int maxDocs_10idTemp  = Integer.parseInt(maxDocs_10id);
        String idFolder_11id=  request.getParameter("idFolder43");
        int idFolder_11idTemp  = Integer.parseInt(idFolder_11id);
        String docTypeId_12id=  request.getParameter("docTypeId45");
        int docTypeId_12idTemp  = Integer.parseInt(docTypeId_12id);
        String password_14id=  request.getParameter("password49");
            java.lang.String password_14idTemp = null;
        if(!password_14id.equals("")){
         password_14idTemp  = password_14id;
        }
        String name_15id=  request.getParameter("name51");
            java.lang.String name_15idTemp = null;
        if(!name_15id.equals("")){
         name_15idTemp  = name_15id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpUserDTO_13id" scope="session" class="ve.com.novatec.www.novatecws.DpUserDTO" />
        <%
        ve1com1novatec1www1novatecws1DpUserDTO_13id.setPassword(password_14idTemp);
        ve1com1novatec1www1novatecws1DpUserDTO_13id.setName(name_15idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id" scope="session" class="ve.com.novatec.www.novatecws.BuscarDocumentosRequest" />
        <%
        ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id.setSubFolders(subFolders_6idTemp);
        ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id.setDpServicesConnectionDTO(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_7id);
        ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id.setMaxDocs(maxDocs_10idTemp);
        ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id.setIdFolder(idFolder_11idTemp);
        ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id.setDocTypeId(docTypeId_12idTemp);
        ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id.setDpUserDTO(ve1com1novatec1www1novatecws1DpUserDTO_13id);
        ve.com.novatec.www.novatecws.BuscarDocumentosResponse buscarDocumentos26mtemp = sampleNovatecwsProxyid.buscarDocumentos(ve1com1novatec1www1novatecws1BuscarDocumentosRequest_5id);
if(buscarDocumentos26mtemp == null){
%>
<%=buscarDocumentos26mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">documenteInfo:</TD>
<TD>
<%
if(buscarDocumentos26mtemp != null){
ve.com.novatec.www.novatecws.DpDocumentInfoDTO[] typedocumenteInfo29 = buscarDocumentos26mtemp.getDocumenteInfo();
        String tempdocumenteInfo29 = null;
        if(typedocumenteInfo29 != null){
        java.util.List listdocumenteInfo29= java.util.Arrays.asList(typedocumenteInfo29);
        tempdocumenteInfo29 = listdocumenteInfo29.toString();
        }
        %>
        <%=tempdocumenteInfo29%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 53:
        gotMethod = true;
        String portDocPath_18id=  request.getParameter("portDocPath72");
        int portDocPath_18idTemp  = Integer.parseInt(portDocPath_18id);
        String hostDocPath_19id=  request.getParameter("hostDocPath74");
            java.lang.String hostDocPath_19idTemp = null;
        if(!hostDocPath_19id.equals("")){
         hostDocPath_19idTemp  = hostDocPath_19id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_17id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_17id.setPortDocPath(portDocPath_18idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_17id.setHostDocPath(hostDocPath_19idTemp);
        String docId_20id=  request.getParameter("docId76");
        int docId_20idTemp  = Integer.parseInt(docId_20id);
        String docOperation_21id=  request.getParameter("docOperation78");
            java.lang.String docOperation_21idTemp = null;
        if(!docOperation_21id.equals("")){
         docOperation_21idTemp  = docOperation_21id;
        }
        String password_23id=  request.getParameter("password82");
            java.lang.String password_23idTemp = null;
        if(!password_23id.equals("")){
         password_23idTemp  = password_23id;
        }
        String name_24id=  request.getParameter("name84");
            java.lang.String name_24idTemp = null;
        if(!name_24id.equals("")){
         name_24idTemp  = name_24id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpUserDTO_22id" scope="session" class="ve.com.novatec.www.novatecws.DpUserDTO" />
        <%
        ve1com1novatec1www1novatecws1DpUserDTO_22id.setPassword(password_23idTemp);
        ve1com1novatec1www1novatecws1DpUserDTO_22id.setName(name_24idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1ObtenerDocumentoRequest_16id" scope="session" class="ve.com.novatec.www.novatecws.ObtenerDocumentoRequest" />
        <%
        ve1com1novatec1www1novatecws1ObtenerDocumentoRequest_16id.setDpServicesConnectionDTO(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_17id);
        ve1com1novatec1www1novatecws1ObtenerDocumentoRequest_16id.setDocId(docId_20idTemp);
        ve1com1novatec1www1novatecws1ObtenerDocumentoRequest_16id.setDocOperation(docOperation_21idTemp);
        ve1com1novatec1www1novatecws1ObtenerDocumentoRequest_16id.setDpUserDTO(ve1com1novatec1www1novatecws1DpUserDTO_22id);
        ve.com.novatec.www.novatecws.ObtenerDocumentoResponse obtenerDocumento53mtemp = sampleNovatecwsProxyid.obtenerDocumento(ve1com1novatec1www1novatecws1ObtenerDocumentoRequest_16id);
if(obtenerDocumento53mtemp == null){
%>
<%=obtenerDocumento53mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dpDocumentDTO:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">content:</TD>
<TD>
<%
if(obtenerDocumento53mtemp != null){
ve.com.novatec.www.novatecws.DpDocumentGenerarDTO tebece0=obtenerDocumento53mtemp.getDpDocumentDTO();
if(tebece0 != null){
byte[] typecontent58 = tebece0.getContent();
        String tempcontent58 = "[";        for(int icontent58=0;icontent58< typecontent58.length;icontent58++){
            tempcontent58 = tempcontent58 + typecontent58[icontent58] + ",";
        }
        int lengthcontent58 = tempcontent58.length();
        tempcontent58 = tempcontent58.substring(0,(lengthcontent58 - 1)) + "]";
        %>
        <%=tempcontent58%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">info:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">mimeId:</TD>
<TD>
<%
if(obtenerDocumento53mtemp != null){
ve.com.novatec.www.novatecws.DpDocumentGenerarDTO tebece0=obtenerDocumento53mtemp.getDpDocumentDTO();
if(tebece0 != null){
ve.com.novatec.www.novatecws.DpDocumentInfoGenerarDTO tebece1=tebece0.getInfo();
if(tebece1 != null){
%>
<%=tebece1.getMimeId()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">length:</TD>
<TD>
<%
if(obtenerDocumento53mtemp != null){
ve.com.novatec.www.novatecws.DpDocumentGenerarDTO tebece0=obtenerDocumento53mtemp.getDpDocumentDTO();
if(tebece0 != null){
ve.com.novatec.www.novatecws.DpDocumentInfoGenerarDTO tebece1=tebece0.getInfo();
if(tebece1 != null){
%>
<%=tebece1.getLength()
%><%}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">id:</TD>
<TD>
<%
if(obtenerDocumento53mtemp != null){
ve.com.novatec.www.novatecws.DpDocumentGenerarDTO tebece0=obtenerDocumento53mtemp.getDpDocumentDTO();
if(tebece0 != null){
ve.com.novatec.www.novatecws.DpDocumentInfoGenerarDTO tebece1=tebece0.getInfo();
if(tebece1 != null){
%>
<%=tebece1.getId()
%><%}}}%>
</TD>
</TABLE>
<%
}
break;
case 86:
        gotMethod = true;
        String portDocPath_27id=  request.getParameter("portDocPath95");
        int portDocPath_27idTemp  = Integer.parseInt(portDocPath_27id);
        String hostDocPath_28id=  request.getParameter("hostDocPath97");
            java.lang.String hostDocPath_28idTemp = null;
        if(!hostDocPath_28id.equals("")){
         hostDocPath_28idTemp  = hostDocPath_28id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_26id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_26id.setPortDocPath(portDocPath_27idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_26id.setHostDocPath(hostDocPath_28idTemp);
        String password_30id=  request.getParameter("password101");
            java.lang.String password_30idTemp = null;
        if(!password_30id.equals("")){
         password_30idTemp  = password_30id;
        }
        String name_31id=  request.getParameter("name103");
            java.lang.String name_31idTemp = null;
        if(!name_31id.equals("")){
         name_31idTemp  = name_31id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpUserDTO_29id" scope="session" class="ve.com.novatec.www.novatecws.DpUserDTO" />
        <%
        ve1com1novatec1www1novatecws1DpUserDTO_29id.setPassword(password_30idTemp);
        ve1com1novatec1www1novatecws1DpUserDTO_29id.setName(name_31idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1LoginRequest_25id" scope="session" class="ve.com.novatec.www.novatecws.LoginRequest" />
        <%
        ve1com1novatec1www1novatecws1LoginRequest_25id.setDpServicesConnectionDTO(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_26id);
        ve1com1novatec1www1novatecws1LoginRequest_25id.setDpUserDTO(ve1com1novatec1www1novatecws1DpUserDTO_29id);
        ve.com.novatec.www.novatecws.LoginResponse login86mtemp = sampleNovatecwsProxyid.login(ve1com1novatec1www1novatecws1LoginRequest_25id);
if(login86mtemp == null){
%>
<%=login86mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">infoLogin:</TD>
<TD>
<%
if(login86mtemp != null){
ve.com.novatec.www.novatecws.DpInfoLoginDTO typeinfoLogin89 = login86mtemp.getInfoLogin();
        if(typeinfoLogin89!= null){
        String tempinfoLogin89 = typeinfoLogin89.toString();
        %>
        <%=tempinfoLogin89%>
        <%
        }}%>
</TD>
</TABLE>
<%
}
break;
case 105:
        gotMethod = true;
        String portDocPath_34id=  request.getParameter("portDocPath114");
        int portDocPath_34idTemp  = Integer.parseInt(portDocPath_34id);
        String hostDocPath_35id=  request.getParameter("hostDocPath116");
            java.lang.String hostDocPath_35idTemp = null;
        if(!hostDocPath_35id.equals("")){
         hostDocPath_35idTemp  = hostDocPath_35id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_33id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_33id.setPortDocPath(portDocPath_34idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_33id.setHostDocPath(hostDocPath_35idTemp);
        String password_37id=  request.getParameter("password120");
            java.lang.String password_37idTemp = null;
        if(!password_37id.equals("")){
         password_37idTemp  = password_37id;
        }
        String name_38id=  request.getParameter("name122");
            java.lang.String name_38idTemp = null;
        if(!name_38id.equals("")){
         name_38idTemp  = name_38id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpUserDTO_36id" scope="session" class="ve.com.novatec.www.novatecws.DpUserDTO" />
        <%
        ve1com1novatec1www1novatecws1DpUserDTO_36id.setPassword(password_37idTemp);
        ve1com1novatec1www1novatecws1DpUserDTO_36id.setName(name_38idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1LoginSimpleRequest_32id" scope="session" class="ve.com.novatec.www.novatecws.LoginSimpleRequest" />
        <%
        ve1com1novatec1www1novatecws1LoginSimpleRequest_32id.setDpServicesConnectionDTO(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_33id);
        ve1com1novatec1www1novatecws1LoginSimpleRequest_32id.setDpUserDTO(ve1com1novatec1www1novatecws1DpUserDTO_36id);
        ve.com.novatec.www.novatecws.LoginSimpleResponse loginSimple105mtemp = sampleNovatecwsProxyid.loginSimple(ve1com1novatec1www1novatecws1LoginSimpleRequest_32id);
if(loginSimple105mtemp == null){
%>
<%=loginSimple105mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">acceso:</TD>
<TD>
<%
if(loginSimple105mtemp != null){
%>
<%=loginSimple105mtemp.isAcceso()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 124:
        gotMethod = true;
        String portDocPath_41id=  request.getParameter("portDocPath133");
        int portDocPath_41idTemp  = Integer.parseInt(portDocPath_41id);
        String hostDocPath_42id=  request.getParameter("hostDocPath135");
            java.lang.String hostDocPath_42idTemp = null;
        if(!hostDocPath_42id.equals("")){
         hostDocPath_42idTemp  = hostDocPath_42id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_40id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_40id.setPortDocPath(portDocPath_41idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_40id.setHostDocPath(hostDocPath_42idTemp);
        String password_44id=  request.getParameter("password139");
            java.lang.String password_44idTemp = null;
        if(!password_44id.equals("")){
         password_44idTemp  = password_44id;
        }
        String name_45id=  request.getParameter("name141");
            java.lang.String name_45idTemp = null;
        if(!name_45id.equals("")){
         name_45idTemp  = name_45id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpUserDTO_43id" scope="session" class="ve.com.novatec.www.novatecws.DpUserDTO" />
        <%
        ve1com1novatec1www1novatecws1DpUserDTO_43id.setPassword(password_44idTemp);
        ve1com1novatec1www1novatecws1DpUserDTO_43id.setName(name_45idTemp);
        String folderId_47id=  request.getParameter("folderId145");
        int folderId_47idTemp  = Integer.parseInt(folderId_47id);
        String mimeId_48id=  request.getParameter("mimeId147");
        int mimeId_48idTemp  = Integer.parseInt(mimeId_48id);
        String docTypeId_49id=  request.getParameter("docTypeId149");
        int docTypeId_49idTemp  = Integer.parseInt(docTypeId_49id);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpAddDocumentDTO_46id" scope="session" class="ve.com.novatec.www.novatecws.DpAddDocumentDTO" />
        <%
        ve1com1novatec1www1novatecws1DpAddDocumentDTO_46id.setFolderId(folderId_47idTemp);
        ve1com1novatec1www1novatecws1DpAddDocumentDTO_46id.setMimeId(mimeId_48idTemp);
        ve1com1novatec1www1novatecws1DpAddDocumentDTO_46id.setDocTypeId(docTypeId_49idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1AgregarDocumentoRequest_39id" scope="session" class="ve.com.novatec.www.novatecws.AgregarDocumentoRequest" />
        <%
        ve1com1novatec1www1novatecws1AgregarDocumentoRequest_39id.setDpServicesConnection(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_40id);
        ve1com1novatec1www1novatecws1AgregarDocumentoRequest_39id.setDpUser(ve1com1novatec1www1novatecws1DpUserDTO_43id);
        ve1com1novatec1www1novatecws1AgregarDocumentoRequest_39id.setAddDocument(ve1com1novatec1www1novatecws1DpAddDocumentDTO_46id);
        ve.com.novatec.www.novatecws.AgregarDocumentoResponse agregarDocumento124mtemp = sampleNovatecwsProxyid.agregarDocumento(ve1com1novatec1www1novatecws1AgregarDocumentoRequest_39id);
if(agregarDocumento124mtemp == null){
%>
<%=agregarDocumento124mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(agregarDocumento124mtemp != null){
%>
<%=agregarDocumento124mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 151:
        gotMethod = true;
        String portDocPath_52id=  request.getParameter("portDocPath160");
        int portDocPath_52idTemp  = Integer.parseInt(portDocPath_52id);
        String hostDocPath_53id=  request.getParameter("hostDocPath162");
            java.lang.String hostDocPath_53idTemp = null;
        if(!hostDocPath_53id.equals("")){
         hostDocPath_53idTemp  = hostDocPath_53id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpServicesConnectionDTO_51id" scope="session" class="ve.com.novatec.www.novatecws.DpServicesConnectionDTO" />
        <%
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_51id.setPortDocPath(portDocPath_52idTemp);
        ve1com1novatec1www1novatecws1DpServicesConnectionDTO_51id.setHostDocPath(hostDocPath_53idTemp);
        String docId_54id=  request.getParameter("docId164");
        int docId_54idTemp  = Integer.parseInt(docId_54id);
        String password_56id=  request.getParameter("password168");
            java.lang.String password_56idTemp = null;
        if(!password_56id.equals("")){
         password_56idTemp  = password_56id;
        }
        String name_57id=  request.getParameter("name170");
            java.lang.String name_57idTemp = null;
        if(!name_57id.equals("")){
         name_57idTemp  = name_57id;
        }
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1DpUserDTO_55id" scope="session" class="ve.com.novatec.www.novatecws.DpUserDTO" />
        <%
        ve1com1novatec1www1novatecws1DpUserDTO_55id.setPassword(password_56idTemp);
        ve1com1novatec1www1novatecws1DpUserDTO_55id.setName(name_57idTemp);
        %>
        <jsp:useBean id="ve1com1novatec1www1novatecws1BorrarDocumentoRequest_50id" scope="session" class="ve.com.novatec.www.novatecws.BorrarDocumentoRequest" />
        <%
        ve1com1novatec1www1novatecws1BorrarDocumentoRequest_50id.setDpServicesConnectionDTO(ve1com1novatec1www1novatecws1DpServicesConnectionDTO_51id);
        ve1com1novatec1www1novatecws1BorrarDocumentoRequest_50id.setDocId(docId_54idTemp);
        ve1com1novatec1www1novatecws1BorrarDocumentoRequest_50id.setDpUserDTO(ve1com1novatec1www1novatecws1DpUserDTO_55id);
        ve.com.novatec.www.novatecws.BorrarDocumentoResponse borrarDocumento151mtemp = sampleNovatecwsProxyid.borrarDocumento(ve1com1novatec1www1novatecws1BorrarDocumentoRequest_50id);
if(borrarDocumento151mtemp == null){
%>
<%=borrarDocumento151mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dato:</TD>
<TD>
<%
if(borrarDocumento151mtemp != null){
%>
<%=borrarDocumento151mtemp.isDato()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>