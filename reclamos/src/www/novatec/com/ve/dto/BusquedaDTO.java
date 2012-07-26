package www.novatec.com.ve.dto;

import java.io.Serializable;

final public class BusquedaDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String value;
	
	public static BusquedaDTO myIntance;
	
	private BusquedaDTO(){
	}
	
	public static BusquedaDTO getIntance(){
		myIntance = new BusquedaDTO();
		return myIntance;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}
	
}
