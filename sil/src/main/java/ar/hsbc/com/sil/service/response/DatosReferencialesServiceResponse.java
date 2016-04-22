package ar.hsbc.com.sil.service.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "infoDatosReferencialesResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class DatosReferencialesServiceResponse extends ServiceResponse{
	
	@XmlElementWrapper(name = "TipoDocumento")
	@XmlElement(name = "TipoDocumento")
	private List<String> tipoDocumento;
	
	@XmlElementWrapper(name = "Compania")
	@XmlElement(name = "Compania")
	private List<String> compania;
	
	@XmlElementWrapper(name = "Producto")
	@XmlElement(name = "Producto")
	private List<String> producto;
	
	@XmlElementWrapper(name = "ModoContacto")
	@XmlElement(name = "ModoContacto")
	private List<String> modoContacto;
	
	@XmlElementWrapper(name = "Causa")
	@XmlElement(name = "Causa")
	private List<String> causa;
	
	@XmlElementWrapper(name = "TelefonoContacto")
	@XmlElement(name = "TelefonoContacto")
	private List<String> telefonoContacto;
	
	@XmlElementWrapper(name = "Mail")
	@XmlElement(name = "Mail")
	private List<String> mail;
	
	@XmlElementWrapper(name = "Motivo")
	@XmlElement(name = "Motivo")
	private List<String> motivo;
	
	@XmlElementWrapper(name = "Estado")
	@XmlElement(name = "Estado")
	private List<String> estado;
	
	public DatosReferencialesServiceResponse() {
		tipoDocumento= new ArrayList<String>();
		compania= new ArrayList<String>();
		producto= new ArrayList<String>();
		modoContacto= new ArrayList<String>();
		causa= new ArrayList<String>();
		telefonoContacto= new ArrayList<String>();
		mail= new ArrayList<String>();
		motivo= new ArrayList<String>();
		estado= new ArrayList<String>();
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
