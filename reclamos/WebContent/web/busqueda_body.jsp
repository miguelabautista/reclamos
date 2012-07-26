<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<p class="titulo">
	<bean:message key="home.estadoCuenta" />
</p>
<br/>

<div align="center">
	<logic:messagesPresent message="errors" >
		<div class="errors" align="center">
			<html:messages id="errors">
				<bean:write name="errors" /><br />
			</html:messages>
		</div>
	</logic:messagesPresent>
</div>

<logic:present name="busqueda" scope="request">
<div style="width: 30%;text-align: center;" >
	<html:link href="home.do"  >
		<bean:message key="home.otraBusqueda" />
	</html:link>
</div>
<br/>
	<html:form action="/generar">
		<display:table id="busqueda" name="busqueda" 
			requestURI="/busqueda.do"  class="display" 
			export="false" cellpadding="0" cellspacing="0"  pagesize="10">
		<display:column titleKey="busqueda.sel">
			<html:radio property="idDoc" value="${busqueda.id}" />
		</display:column>
		<display:column  titleKey="reclamos.banco" property="folder"/>
		<logic:iterate id="indexes" name="busqueda" property="busquedaDTOs" >
			<display:column title="${indexes.name}" style="text-align:center; " >
				<bean:write name="indexes" property="value"/>
			</display:column>
		</logic:iterate>
		<logic:greaterThan value="3" parameter="borrado" scope="session" name="borrado">
			<display:column media="html">
				<a href="borrar.do?id=<c:out value='${busqueda.id}' />" onclick="return confirm('¿Esta Seguro?')" >
					<bean:message key="comunes.borrar"/>
				</a>
			</display:column>
		</logic:greaterThan>
		</display:table>
		<br/><br/>
		<div style="text-align: center; width: 70%; margin-left: 20px;"  >
			<html:submit style="text-transform: capitalize;" >
				<bean:message key="busqueda.generar"  />
			</html:submit>
		</div>
	</html:form>
</logic:present>