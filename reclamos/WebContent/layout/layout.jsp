<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<noscript>
  		<meta http-equiv="refresh" content="0; URL=index.do"/>
  	</noscript>
  	<link rel="shortcut icon" href=<%=request.getContextPath()+"/images/logo.ico"%> type="image/ico" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<title>
		<tiles:getAsString name="titulo"/>
	</title>
	<link rel="stylesheet" type="text/css" href=<%=request.getContextPath()+"/css/docpath.css"%>   />
	<link rel="stylesheet" type="text/css" href=<%=request.getContextPath()+"/css/displayTag.css"%>   />
	<link rel="stylesheet" type="text/css" href=<%=request.getContextPath()+"/css/estilos.css"%>   />
	<link rel="stylesheet" type="text/css" href=<%=request.getContextPath()+"/css/jquery-ui-1.7.2.custom.css"%> />
	<script type="text/javascript" src=<%=request.getContextPath()+"/js/jquery.blockUI.js"%>></script>	
	<!--<script type="text/javascript" src=<%=request.getContextPath()+"/js/inactividad.js"%>></script>-->
	<script type="text/javascript" src=<%=request.getContextPath()+"/js/formato_cuenta.js"%>></script>
	<script type="text/javascript"  src=<%=request.getContextPath()+"/js/jquery-1.3.2.min.js"%> > </script>
	<script type="text/javascript"  src=<%=request.getContextPath()+"/js/jquery-ui.min.js"%> > </script>

  </head>
  
  <!--
  	<body onload="ini()" onkeypress="parar()" onmousemove="parar()" onclick="parar()" >
  -->
  <body>
    <img src=<%=request.getContextPath()+"/images/fondo_estados_cuenta_aplicacion.jpg"%> name="fondo" id="fondo"> 
    <div id="contenido">
    	<img id="logoCredicar" src=<%=request.getContextPath()+"/images/logo-ccr_estados-de-cuenta_aplicacion.png"%> />
    	<div style="width: 20%; margin-left: 70%; position: absolute; margin-top: 8%; ">
    		<html:link href="salir.do" >
    			<bean:message key="comunes.cerrarSesion" />
    		</html:link>
    	</div>
 		<tiles:insert name="contenido"></tiles:insert>
 	</div>
  </body>
</html>