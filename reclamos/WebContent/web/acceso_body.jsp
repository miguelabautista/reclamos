<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<div align="center" >
	<logic:messagesPresent message="errors" >
		<div class="errors" align="center">
			<html:messages id="errors">
				<bean:write name="errors" /><br/>
			</html:messages>
		</div>
	</logic:messagesPresent>
</div>

<script>
$(document).ready(function() { 
    $('#btnMsg').click(function() { 
        $.blockUI({ 
        	message:  '<img src="<%=request.getContextPath()+"/images/loading.gif"%>"  style="width: 40px;" alt="........" />',
        	overlayCSS: { backgroundColor: '#fff' } }); 
 
        setTimeout($.unblockUI, 10000); 
    }); 
});
</script>

<html:form action="/acceso">
	<table class="Table_01" height="230" cellspacing="0" cellpadding="0" width="300" border="0" align="center">
		<tr>
			<td width="106" height="60" align="center">
				<img src=<%=request.getContextPath()+"/images/bt_usuario.png"%> alt="logoUsuario">
			</td>
            <td width="393" >
              	<html:text property="login"/>
             </td>
	  	</tr>
	  	<tr>
	  		<td align="center">
	  			<p class="DPtext1"><bean:message key="acceso.login"/></p>
			</td>
			<td></td>
	  	</tr>
		<tr>
			<td colspan="2">
				<p>&nbsp;</p>
	    	</td>
	  	</tr>
	  	
	  	<tr>
	  		<td height="60" align="center">
	  			<img src=<%=request.getContextPath()+"/images/candado.png"%> alt="logoContrasena" >
	  		</td>
	  		<td>
	  			<html:password property="password"/>
	  		</td>
	  	</tr>
	  	<tr>
	  		<td align="center">
	  			<p class="DPtext1">
	  				<bean:message key="acceso.password"/>
	  			</p>
	  		</td>
			<td></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<html:submit titleKey="acceso.submit" styleId="btnMsg"  >
					<bean:message key="acceso.submit" />
				</html:submit>
			</td>
		</tr>
	</table>
</html:form>