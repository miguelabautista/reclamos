package com.novatec.test;

import java.rmi.RemoteException;

import ve.com.novatec.www.novatecws.BuscarDocumentosRequest;
import ve.com.novatec.www.novatecws.BuscarDocumentosResponse;
import ve.com.novatec.www.novatecws.DpDocumentInfoDTO;
import ve.com.novatec.www.novatecws.DpIndexDTO;
import ve.com.novatec.www.novatecws.DpServicesConnectionDTO;
import ve.com.novatec.www.novatecws.DpUserDTO;
import ve.com.novatec.www.novatecws.Indexes;
import ve.com.novatec.www.novatecws.NovatecwsProxy;

public class Main {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		NovatecwsProxy ws = new NovatecwsProxy();
		DpServicesConnectionDTO connection = new DpServicesConnectionDTO();
		connection.setHostDocPath("10.132.0.172");
		connection.setPortDocPath(17300);
		DpUserDTO user = new DpUserDTO();
		user.setName("admin");
		user.setPassword("admin");

		BuscarDocumentosRequest request = new BuscarDocumentosRequest();
		request.setDpServicesConnectionDTO(connection);
		Indexes[] inde = { new Indexes(1, "5400-8632-1526-0601"),
				new Indexes(3, "11"), new Indexes(4, "12") };

		request.setDpUserDTO(user);

		request.setDocTypeId(1);

		request.setIdFolder(-1);

		request.setIndexes(inde);
		request.setSubFolders(true);
		request.setMaxDocs(100);

		BuscarDocumentosResponse response;
		
		response = ws.buscarDocumentos(request);

		DpDocumentInfoDTO[] dto = response.getDocumenteInfo();

		for (DpDocumentInfoDTO d : dto) {
			DpIndexDTO[] in = d.getIndexes();
			for(DpIndexDTO w:in){
				if(w.getId()==1){
					System.out.println(w.getValue());
				}
			}
			System.out.println(d.getId() + " " + d.getFolder() + " " );
		}

	}

}
