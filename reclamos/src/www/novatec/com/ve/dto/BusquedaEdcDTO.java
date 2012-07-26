package www.novatec.com.ve.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

final public class BusquedaEdcDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String folder;
	
	private Collection<BusquedaDTO> busquedaDTOs = 
		new ArrayList<BusquedaDTO>();
	
	private static BusquedaEdcDTO myIntance;
	
	private BusquedaEdcDTO(){
		
	}
	
	public static BusquedaEdcDTO getIntance(){
		myIntance = new BusquedaEdcDTO();
		return myIntance;
	}
	public String getFolder() {
		return folder;
	}
	public void setFolder(String folder) {
		this.folder = folder;
	}

	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}

	public Collection<BusquedaDTO> getBusquedaDTOs() {
		return busquedaDTOs;
	}

	public void setBusquedaDTOs(final Collection<BusquedaDTO> busquedaDTOs) {
		this.busquedaDTOs = busquedaDTOs;
	}
	
	
}
