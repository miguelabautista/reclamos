
function format(input){
	var valor = input.value.toLowerCase();
	var nuevo = "";
	if(valor.length==19){
		input.value = valor;
		return;
	}
	valor = reemplazo(valor);
	var cont=0;
	var tamanio= valor.length;
	if(tamanio==16){
		for(var i=0;i<tamanio;i++){
			if(cont==4){
				nuevo += "-";
				cont=0;
			}
			nuevo += valor.charAt(i);
			cont++;
		}
	}else if(tamanio<16){
		for(var i=0;i<tamanio;i++){
			nuevo += valor.charAt(i);
		}
	}
	input.value = nuevo;
}

function monto(input){
	var valor = input.value.toLowerCase();
	var nuevo = "";
	/*if(valor.length==12){
		input.value = valor;
		return;
	}*/
	valor = reemplazo(valor);
	//var cont=0;
	var tamanio= valor.length;
	var tamanioFin = (tamanio-2);
	if(tamanio>=3){
		for(var i=0;i<tamanio;i++){
			if(i==tamanioFin){
				nuevo += ",";
			}
			nuevo += valor.charAt(i);
			if(i>11){
				break;
			}
			
		}
	}else if(tamanio<3){
		for(var i=0;i<tamanio;i++){
			nuevo += valor.charAt(i);
		}
	}
	input.value = nuevo;
}

function reemplazo(valor){
	valor = valor.replace(/[a-zñ]/gi,"");
	valor = valor.replace("+","");
	valor = valor.replace("*","");
	valor = valor.replace("_","");
	valor = valor.replace("(","");
	valor = valor.replace(")","");
	valor = valor.replace("/","");
	valor = valor.replace("\\","");
	valor = valor.replace("!","");
	valor = valor.replace("\"","");
	valor = valor.replace("·","");
	valor = valor.replace("$","");
	valor = valor.replace("%","");
	valor = valor.replace("&","");
	valor = valor.replace("^","");
	valor = valor.replace("¨","");
	valor = valor.replace("]","");
	valor = valor.replace("[","");
	valor = valor.replace("ç","");
	valor = valor.replace("¿","");
	valor = valor.replace("?","");
	valor = valor.replace(".","");
	valor = valor.replace(",","");
	valor = valor.replace(";","");
	valor = valor.replace(":","");
	valor = valor.replace("=","");
	valor = valor.replace("ª","");
	valor = valor.replace("{","");
	valor = valor.replace("}","");
	valor = valor.replace("~","");
	valor = valor.replace("'","");
	valor = valor.replace("¡","");
	valor = valor.replace("|","");
	valor = valor.replace("@","");
	valor = valor.replace("#","");
	valor = valor.replace("½","");
	valor = valor.replace("¬","");
	valor = valor.replace(" ","");
	valor = valor.replace("-","");
	return valor;
}