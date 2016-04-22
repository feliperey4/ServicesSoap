package ar.hsbc.com.sil.service.impl;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import ar.hsbc.com.sil.service.DatosReferencialesService;
import ar.hsbc.com.sil.service.response.DatosReferencialesServiceResponse;
import ar.hsbc.com.sil.service.utils.DatosReferencialesUtils;

@WebService(endpointInterface = "ar.hsbc.com.sil.service.DatosReferencialesService", serviceName = "DatosReferencialesService", portName = "DatosReferencialesServicePort")
@HandlerChain(file = "cliente-service-handle-chain.xml")
public class DatosReferencialesServiceImpl implements DatosReferencialesService{

	public enum TipoDominio {
		TIPO_DOCUMENTO,
		COMPANIA,
		PRODUCTO,
		MODO_CONTACTO,
		CAUSA,
		TELEFONO_CONTACTO,
		MAIL,
		MOTIVO,
		ESTADO;		
	}
	
	@Override
	public DatosReferencialesServiceResponse getDatosReferenciales(String dominio) {
		DatosReferencialesServiceResponse respuesta= new DatosReferencialesServiceResponse();
		DatosReferencialesUtils datos= new DatosReferencialesUtils();
		
		if(TipoDominio.TIPO_DOCUMENTO.name().equals(dominio)){
			respuesta.getTipoDocumento().addAll(datos.getTipoDocumento());
		}
		else if(TipoDominio.COMPANIA.name().equals(dominio)){
			respuesta.getCompania().addAll(datos.getCompania());
		}
		else if(TipoDominio.PRODUCTO.name().equals(dominio)){
			respuesta.getProducto().addAll(datos.getProducto());
		}
		else if(TipoDominio.MODO_CONTACTO.name().equals(dominio)){
			respuesta.getModoContacto().addAll(datos.getModoContacto());
		}
		else if(TipoDominio.CAUSA.name().equals(dominio)){
			respuesta.getCausa().addAll(datos.getCausa());
		}
		else if(TipoDominio.TELEFONO_CONTACTO.name().equals(dominio)){
			respuesta.getTelefonoContacto().addAll(datos.getTelefonoContacto());
		}
		else if(TipoDominio.MAIL.name().equals(dominio)){
			respuesta.getMail().addAll(datos.getMail());
		}
		else if(TipoDominio.MOTIVO.name().equals(dominio)){
			respuesta.getMotivo().addAll(datos.getMotivo());
		}
		else if(TipoDominio.ESTADO.name().equals(dominio)){
			respuesta.getEstado().addAll(datos.getEstado());
		}
		
		return respuesta;
	}

}
