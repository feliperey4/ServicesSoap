package ar.hsbc.com.sil.service.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "calle", "localidad", "telefono", "telefonoLaboral", "codigoPostal" })
public class Domicilio {

	private String calle;
	private String localidad;
	private Telefono telefono;
	private Telefono telefonoLaboral;
	private String codigoPostal;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Telefono getTelefonoLaboral() {
		return telefonoLaboral;
	}

	public void setTelefonoLaboral(Telefono telefonoLaboral) {
		this.telefonoLaboral = telefonoLaboral;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}
