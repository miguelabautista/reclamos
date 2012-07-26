<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<script>
$(document).ready(function() { 
    $('#btnMsg').click(function() { 
        $.blockUI({ 
        	message:  '<img src="<%=request.getContextPath()+"/images/loading.gif"%>" style="width: 40px;" alt="........" />',
        	overlayCSS: { backgroundColor: '#fff' } }); 
 
        setTimeout($.unblockUI, 10000); 
    }); 
});

jQuery(function($){
	$.datepicker.regional['es'] = {
		closeText: 'Cerrar',
		prevText: '&#x3c;Ant',
		nextText: 'Sig&#x3e;',
		currentText: 'Hoy',
		monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
		'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
		monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
		'Jul','Ago','Sep','Oct','Nov','Dic'],
		dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
		dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
		dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
		weekHeader: 'Sm',
		dateFormat: 'mmddy',
		firstDay: 1,
		isRTL: false,
		showMonthAfterYear: false,
		yearSuffix: ''};
	$.datepicker.setDefaults($.datepicker.regional['es']);
});    

$(document).ready(function(){
	$('#datepicker').datepicker({
		   showOn: 'button', 
		   buttonImageOnly: true, 
		   changeMonth: true,
		   buttonImage: '<%=request.getContextPath()+"/images/datepicker.png"%>' 

	 });
});

$(document).ready(function(){
	$('#datepicker_2').datepicker({
		   showOn: 'button', 
		   buttonImageOnly: true, 
		   changeMonth: true,
		   buttonImage: '<%=request.getContextPath()+"/images/datepicker.png"%>' 

	 });
});

function reset(){
	var formulario = document.addReclamosForm;
	formulario.idFolder.value='';
	formulario.numTarjeta.value='';
	formulario.numAfiliado.value='';
	formulario.numAutorizacion.value='';
	formulario.trace.value='';
	formulario.fechaTransaccion.value='';
	formulario.montoTransaccion.value='';
	formulario.fechaCreacionRegistro='';
	//formulario.file.value='';
}

</script>
<logic:notEmpty name="sesion" scope="session" >
<p class="titulo">
	<bean:message key="home.estadoCuenta" />
</p>
<div align="center">
	<logic:messagesPresent property="exito">
		<div class="exito" id="exito">
			<html:errors property="exito" />
		</div>
	</logic:messagesPresent>
	<logic:messagesNotPresent property="exito">
		<logic:messagesPresent message="errors" >
			<div class="errors" align="center">
				<html:messages id="errors">
					<bean:write name="errors" /><br />
				</html:messages>
			</div>
		</logic:messagesPresent>
	</logic:messagesNotPresent>
</div>
 	<html:form action="/busqueda">
  		<table cellspacing="0" cellpadding="0" width="642" border="0" align="center">
      		<tr>
  				<td class="DPtext" bgcolor="#EEEEEE">
		  			<bean:message key="reclamos.idFolder" />
		  		</td>
		  		<td>
		  			<html:select property="idFolder">
		  				<html:optionsCollection name="idFolder" label="descFolder" value="idFolder" />
		  			</html:select>
		  		</td>
  			</tr>
      		<tr>
      			<td class="DPtext" bgcolor="#EEEEEE">
      				<bean:message key="reclamos.numeroTarjeta" />
      			</td >
      			<td class="DPtext" bgcolor="#EEEEEE">
      				<bean:message key="reclamos.numeroAfiliado" />
      			</td>
      			
      		</tr>
      		<tr>
      			<td class="inputText">
      				<html:text property="numTarjeta" maxlength="21" ></html:text>
      			</td>
      			<td class="inputText">
      				<html:text property="numAfiliado" maxlength="8" ></html:text>
      			</td>
      		</tr>
      		<tr>
      			<td class="DPtext" bgcolor="#EEEEEE">
      				<bean:message key="reclamos.numeroAutorizacion" />
      			</td>
      			<td class="DPtext" bgcolor="#EEEEEE">
      				<bean:message key="reclamos.trace" />
      			</td>
      			
      		</tr>
      		<tr>
      			<td class="inputText">
      				<html:text property="numAutorizacion" maxlength="6" ></html:text>
      			</td>
      			<td class="inputText">
      				<html:text property="trace" maxlength="6" ></html:text>
      			</td>
      		</tr>
      		<tr>
      			<td class="DPtext" bgcolor="#EEEEEE">
      				<bean:message key="reclamos.fechaTransaccion" />
      			</td>
      			<td class="DPtext" bgcolor="#EEEEEE">
      				<bean:message key="reclamos.montoTransaccion" />
      			</td>
      			
      		</tr>
      		<tr>
      			<td>
      				<html:text property="fechaTransaccion" styleId="datepicker"  ></html:text>
      				<div style="width: 35%;font-size: 12px;font-weight: normal;">mmddyy</div>			
      			</td>
      			<td>
      				<html:text property="montoTransaccion" maxlength="13" onkeyup="monto(this)"></html:text>
      			</td>
      		</tr>
      		
      		<tr>
      			<td class="DPtext" bgcolor="#EEEEEE" colspan="2">
      				<bean:message key="reclamos.fechaCreacionRegistro" />
      			</td>
      			
      		</tr>
      		<tr>
      			<td colspan="2" >
      				 <html:text property="fechaCreacionRegistro" styleId="datepicker_2"></html:text>
      				 <div style="width: 35%;font-size: 12px;font-weight: normal;">mmddyy</div>	
      			</td>
      		</tr>
      		
	  		<tr>
	  			<td align="center" colspan="3" bgcolor="#EEEEEE" class="boton"> 
	  				<html:submit styleId="btnMsg" >
						<bean:message key="reclamos.submit" />
					</html:submit>
	  			</td>
	  		</tr>
  		</table>         
   </html:form>
</logic:notEmpty>
<script language="JavaScript" type="text/javascript">
	reset();
</script>