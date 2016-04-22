package ar.hsbc.com.sil.service.utils;

import java.util.ArrayList;
import java.util.List;

public class DatosReferencialesUtils {

	private List<String> tipoDocumento= new ArrayList<String>();
	
	private List<String> compania= new ArrayList<String>();
	
	private List<String> producto= new ArrayList<String>();
	
	private List<String> modoContacto= new ArrayList<String>();
	
	private List<String> causa= new ArrayList<String>();
	
	private List<String> telefonoContacto= new ArrayList<String>();
	
	private List<String> mail= new ArrayList<String>();
	
	private List<String> motivo= new ArrayList<String>();
	
	private List<String> estado= new ArrayList<String>();
	
	
	public DatosReferencialesUtils(){
		
		// Tipo de documento.
		tipoDocumento.add("DNI");
		tipoDocumento.add("LE");
		tipoDocumento.add("LC");
		tipoDocumento.add("CUIL");
		tipoDocumento.add("CUIT");
		tipoDocumento.add("OTROS");
		
		//Modo de contacto.
		modoContacto.add("Canal Call Business");
		
		//Causa.
		causa.add("Pedidos");
		
		//Telefono de contacto.
		telefonoContacto.add("0541145050594 - (COMERCIAL)");
		telefonoContacto.add("0541145679168 - (RESIDENCIAL)");
		
		// Mail
		mail.add("adrian@ibm.com.ar");
		mail.add("adrianb@gmail.com");
		
		// Motivo.
		motivo.add("Acuerdos");
		motivo.add("Baja Firmante");
		motivo.add("Baja Tarjeta de Débito");
		motivo.add("Baja de Boletín");
		motivo.add("Baja de Tarjeta de Crédito");
		motivo.add("Cambio de Cierre de Cartera de Tarjeta de Crédito");
		motivo.add("Cambio de Domicilio de Tarjeta de Crédito");
		motivo.add("Modificación Fecha de Nacimiento");
		motivo.add("Reimpresión de Plásticos Tarjeta de Crédito");
		
		//Estado
		estado.add("Derivado");
		estado.add("Para Autorizar");
		estado.add("Resuelto");
		estado.add("Transferido");
		estado.add("Verificar");
		
	}


	public List<String> getTipoDocumento() {
		return tipoDocumento;
	}


	public List<String> getCompania() {
		return compania;
	}


	public List<String> getProducto() {
		return producto;
	}


	public List<String> getModoContacto() {
		return modoContacto;
	}


	public List<String> getCausa() {
		return causa;
	}


	public List<String> getTelefonoContacto() {
		return telefonoContacto;
	}


	public List<String> getMail() {
		return mail;
	}


	public List<String> getMotivo() {
		return motivo;
	}


	public List<String> getEstado() {
		return estado;
	}
	
	
	
}
