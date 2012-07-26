package www.novatec.com.ve.utils;

import org.apache.log4j.Logger;



public class Utils {
	/*private final static Logger LOG_PANTALLA = 
		Logger.getLogger(Utils.class);*/

	/*
	 * metodo encagado de formatear el numero de cuenta 
	 * 0000********0000
	 */
	public static String formatearCuenta(String cuenta){
		StringBuilder cuentaFormateada = new StringBuilder();
		for (int i = 0; i < cuenta.toCharArray().length; i++) {
			if(i>3 & i<15){
				cuentaFormateada.append("*");
			}else{
				cuentaFormateada.append(cuenta.toCharArray()[i]);
			}
		}
		return cuentaFormateada.toString();
	} 
	
	
	public static String agregarDigitos(final String numeroCuenta){
		final StringBuilder formato = new StringBuilder();
			if(!numeroCuenta.isEmpty()){
				if(numeroCuenta.toCharArray().length < 21){
					for (int i = 0; i <(21-numeroCuenta.toCharArray().length) ; i++) {
						formato.append("0");
					}
					formato.append(numeroCuenta);
				}
				else{
					formato.append(numeroCuenta);
				}
			}
		return formato.toString();
	}
}
