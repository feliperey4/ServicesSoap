package ar.hsbc.com.sil.service.impl;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import ar.hsbc.com.sil.service.ClienteService;
import ar.hsbc.com.sil.service.cliente.Cliente;
import ar.hsbc.com.sil.service.response.ClienteServiceResponse;
import ar.hsbc.com.sil.service.utils.ClienteUtils;

//Service Implementation Bean

@WebService(endpointInterface = "ar.hsbc.com.sil.service.ClienteService", serviceName = "ClienteService", portName = "ClienteServicePort")
@HandlerChain(file = "cliente-service-handle-chain.xml")
public class ClienteServiceImpl implements ClienteService {

	@Override
	public ClienteServiceResponse getInfoCliente(String empresa, String tipoDocumento, String numeroDocumento, String razonSocial) {
		ClienteServiceResponse infoClienteResponse = new ClienteServiceResponse();
		if (empresa.isEmpty()) {
			infoClienteResponse.setCodigo("1");
			infoClienteResponse.setDescripcion("Faltan datos para la consulta: el campo Empresa no puede ser vacío");
		} else if (tipoDocumento.isEmpty()) {
			infoClienteResponse.setCodigo("1");
			infoClienteResponse.setDescripcion("Faltan datos para la consulta: el campo Tipo de Documento no puede ser vacío");
		}else if(!numeroDocumento.isEmpty() && razonSocial.isEmpty()){
			ClienteUtils clienteUtils = new ClienteUtils();
			infoClienteResponse.setCodigo("2");
			infoClienteResponse.setDescripcion("Cliente no existe.");
			for (Cliente cliente : clienteUtils.getClientes()) {
				if (cliente.getDocumento().equals(numeroDocumento)) {
					infoClienteResponse.addCliente(cliente);
					infoClienteResponse.setCodigo("0");
					infoClienteResponse.setDescripcion("");
					break;
				} 
			}
		}else if(!razonSocial.isEmpty()){
			ClienteUtils clienteUtils = new ClienteUtils();
			infoClienteResponse.setCodigo("2");
			infoClienteResponse.setDescripcion("Cliente no existe.");
			for (Cliente cliente : clienteUtils.getClientes()) {
				if (cliente.getRazonSocial().contains(razonSocial)) {
					infoClienteResponse.addPersona( cliente.getPersona());
					infoClienteResponse.setCodigo("0");
					infoClienteResponse.setDescripcion("");
				} 
			}
		}else {
			infoClienteResponse.setCodigo("1");
			infoClienteResponse.setDescripcion("Faltan datos para la consulta: los campos Numero de documento o Razon Social no pueden ser vacío");			
		}

		return infoClienteResponse;
	}

	@Override
	public ClienteServiceResponse getInfoClientes(String empresa, String tipoDocumento, String numeroDocumento, String razonSocial, String compania,
			String producto, String poliza) {
		// TODO Auto-generated method stub
		return null;
	}

}
