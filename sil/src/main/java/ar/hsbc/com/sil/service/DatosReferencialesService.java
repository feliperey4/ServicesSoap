package ar.hsbc.com.sil.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ar.hsbc.com.sil.service.response.DatosReferencialesServiceResponse;

@WebService
@SOAPBinding(style = Style.RPC)
public interface DatosReferencialesService {

	@WebMethod
	@WebResult(partName = "DatosReferencialesResponse")
	DatosReferencialesServiceResponse getDatosReferenciales(String dominio);
	
}
