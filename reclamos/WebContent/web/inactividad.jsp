<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<logic:empty name="sesion" scope="session" >
	<logic:redirect action="salir.do" />
</logic:empty>

<tiles:insert   page="/layout/layoutInactividad.jsp" flush="true">
	<tiles:put name="titulo" value="CCR" />
	<tiles:put name="contenido" value="/web/inactividad_body.jsp" />
</tiles:insert>
