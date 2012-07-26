var inactividad;
var tiempo = 60000;// 20 segundos
function ini() {
	inactividad = setTimeout('location="inactividad.do"',tiempo); 
}
function parar() {
	clearTimeout(inactividad);
	inactividad = setTimeout('location="inactividad.do"',tiempo);
}