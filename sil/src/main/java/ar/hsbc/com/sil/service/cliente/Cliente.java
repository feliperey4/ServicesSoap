package ar.hsbc.com.sil.service.cliente;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"cuil", "sexo", "estadoCivil", "edad", "fechaNacimiento", "nacionalidad",
		"segmento", "domicilio", "telefonos", "productos" })
public class Cliente extends Persona{

	private String sexo;
	private String cuil;
	private String estadoCivil;
	private String edad;
	private String fechaNacimiento;
	private String nacionalidad;
	private Domicilio domicilio;
	private String segmento;

	@XmlElementWrapper(name = "otrosTelefonos")
	@XmlElement(name = "telefono")
	private List<Telefono> telefonos;

	@XmlElementWrapper(name = "productos")
	@XmlElement(name = "producto")
	private List<Producto> productos;

	public Persona getPersona(){
		Persona persona= new Persona();
		persona.setDocumento(this.getDocumento());
		persona.setRazonSocial(this.getRazonSocial());
		persona.setTipoDocumento(this.getTipoDocumento());
		return persona;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
