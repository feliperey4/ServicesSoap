package ar.hsbc.com.sil.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ar.hsbc.com.sil.service.response.ClienteServiceResponse;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface ClienteService {

	@WebMethod
	@WebResult(partName = "ClienteServiceResponse")
	ClienteServiceResponse getInfoCliente(String empresa, String tipoDocumento, String numeroDocumento, String razonSocial);

	@WebMethod
	@WebResult(partName = "ClienteServiceResponse")
	ClienteServiceResponse getInfoClientes(String empresa, String tipoDocumento, String numeroDocumento, String razonSocial, String compania,
			String producto, String poliza);

}