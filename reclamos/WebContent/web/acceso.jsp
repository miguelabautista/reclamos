<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
 
 
<tiles:insert   page="/layout/layoutAcceso.jsp" flush="true">
	<tiles:put name="titulo" value="CCR" />
	<tiles:put name="contenido" value="/web/acceso_body.jsp" />
</tiles:insert>