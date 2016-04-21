package ar.hsbc.com.sil.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ar.hsbc.com.sil.service.response.ProductoServiceResponse;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface ProductoService {

	@WebMethod
	@WebResult(partName = "ProductoServiceResponse")
	ProductoServiceResponse getProductosPorCliente(String dni);
}
