<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<link rel="shortcut icon" href="/favicon.ico" />
		<title>
			<tiles:getAsString name="titulo" />
		</title>
		<link rel="shortcut icon" href=<%=request.getContextPath()+"/images/logo.ico"%> type="image/ico" />
		<link rel="stylesheet" type="text/css" href=<%=request.getContextPath()+"/css/docpath_acceso.css"%>   />
		<script type="text/javascript"  src=<%=request.getContextPath()+"/js/jquery-1.3.2.min.js"%> > </script>
		<script type="text/javascript" src=<%=request.getContextPath()+"/js/jquery.blockUI.js"%>></script>		
  </head>
  <body>
  	<img src=<%=request.getContextPath()+"/images/fondo_estados-de-cuenta_aplicacion_fondo.jpg"%> id="fondo" > 
  		<div id=contenido>
  			<img id="logoCredicar" src=<%=request.getContextPath()+"/images/logo-ccr_estados-de-cuenta_aplicacion.png"%> />
  			<p class="titulo">
  				<bean:message key="home.estadoCuenta" />
  			</p>
  			<noscript>
				<div style="width: 70%;text-align: center; 
					border: solid 1px black;
					background-color:#ed3a3a;
					margin: 0 auto 0 auto;font-size: 45px;font-weight:bolder; ">
					<bean:message key="comunes.javaScript" />
				</div>
			</noscript>
  			<tiles:insert name="contenido" />
       
       		 <table class="tabla2">
				 <tr>
				 	<td width="60" height="50" align="center">
				 		<img  src=<%=request.getContextPath()+"/images/logo-maestro.jpg" %> />
				 	</td>
				 	<td width="60" align="center">
				 		<img src=<%=request.getContextPath()+"/images/logo-mastercard.jpg" %> >
				 	</td>
		            <td width="60" align="center">
		            	<img src=<%=request.getContextPath()+"/images/logo-visa.jpg"%> >
		            </td>
        		</tr>
   			</table>
   		</div>
  </body>
</html>