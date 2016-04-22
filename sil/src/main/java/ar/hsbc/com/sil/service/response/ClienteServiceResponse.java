package ar.hsbc.com.sil.service.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.hsbc.com.sil.service.cliente.Cliente;
import ar.hsbc.com.sil.service.cliente.Persona;

@XmlRootElement(name = "infoClienteResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClienteServiceResponse extends ServiceResponse {

	@XmlElementWrapper(name = "clientes")
	@XmlElement(name = "cliente")
	private List<Cliente> clientes;
	
	@XmlElementWrapper(name = "persona")
	@XmlElement(name = "persona")
	private List<Persona> personas;

	public ClienteServiceResponse() {
//		clientes = new ArrayList<Cliente>();
//		personas= new ArrayList<Persona>();
	}

	public void addCliente(Cliente cliente) {
		if(this.clientes==null)this.clientes = new ArrayList<Cliente>();
		this.clientes.add(cliente);
	}
	
	public void addPersona(Persona persona){
		if(this.personas==null)this.personas= new ArrayList<Persona>();
		this.personas.add( persona);
	}

//	public List<Cliente> getClientes() {
//		return clientes;
//	}
//
//	public void setClientes(List<Cliente> clientes) {
//		this.clientes = clientes;
//	}

}
