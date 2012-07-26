<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<table class="Table_01" cellspacing="0" cellpadding="0" width="642" border="0" align="center">
	<tr>
		<td>
			<p>
				<bean:message key="mensaje.inactividad"/>
			</p>
		</td>
	</tr>
	<tr>
		<td>
			<a href="javascript:history.back();" >
				<bean:message key="comunes.volver" /> 
			</a>
		</td>
	</tr>
</table>
