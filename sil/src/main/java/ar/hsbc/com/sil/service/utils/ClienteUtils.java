package ar.hsbc.com.sil.service.utils;

import java.util.ArrayList;
import java.util.List;

import ar.hsbc.com.sil.service.cliente.Cliente;
import ar.hsbc.com.sil.service.cliente.Domicilio;
import ar.hsbc.com.sil.service.cliente.Producto;
import ar.hsbc.com.sil.service.cliente.Telefono;

public class ClienteUtils {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private String hola;
	
	public ClienteUtils() {
		Cliente cliente1 = new Cliente();
		cliente1.setDocumento("15827285");
		cliente1.setRazonSocial("Lio Messi");
		cliente1.setNacionalidad("Argentina");
		cliente1.setFechaNacimiento("19121986");
		cliente1.setTipoDocumento("DNI");
		cliente1.setCuil("20-15827285-1");
		cliente1.setEdad("29");
		cliente1.setEstadoCivil("Casado");
		cliente1.setSegmento("Premier Black");
		cliente1.setSexo("Masculino");
		Domicilio domicilio1 = new Domicilio();
		domicilio1.setCalle("Pedernera");
		domicilio1.setLocalidad("Rosario");
		domicilio1.setCodigoPostal("1212");
		Telefono telefono = new Telefono();
		telefono.setTipo("Fijo (Casa)");
		telefono.setNumero("1144881909");
		domicilio1.setTelefono(telefono);
		Telefono telefonoLaboral = new Telefono();
		telefonoLaboral.setTipo("Laboral (1)");
		telefonoLaboral.setNumero("1142120909");
		domicilio1.setTelefonoLaboral(telefonoLaboral);
		cliente1.setDomicilio(domicilio1);
		cliente1.setProductos(getProductosA());
		cliente1.setTelefonos(getTelefonosA());
		clientes.add(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setDocumento("12498362");
		cliente2.setRazonSocial("María Pérez");
		cliente2.setNacionalidad("Uruguay");
		cliente2.setFechaNacimiento("16081983");
		cliente2.setTipoDocumento("Cedula");
		cliente2.setCuil("27-12498362-3");
		cliente2.setEdad("32");
		cliente2.setEstadoCivil("Soltero");
		cliente2.setSegmento("Advance");
		cliente2.setSexo("Femenino");
		Domicilio domicilio2 = new Domicilio();
		domicilio2.setCalle("San Pedrito");
		domicilio2.setLocalidad("Maldonado");
		domicilio2.setCodigoPostal("33127");
		Telefono telefono2 = new Telefono();
		telefono2.setTipo("Celular");
		telefono2.setNumero("15334881909");
		domicilio1.setTelefono(telefono2);
		Telefono telefonoLaboral2 = new Telefono();
		telefonoLaboral2.setTipo("Laboral (1)");
		telefonoLaboral2.setNumero("1154019988");
		domicilio1.setTelefonoLaboral(telefonoLaboral2);
		cliente2.setDomicilio(domicilio2);
		cliente2.setProductos(getProductosB());
		cliente2.setTelefonos(getTelefonosB());
		clientes.add(cliente2);
	}

	public List<Producto> getProductos(){
		List<Producto> productos=getProductosA();
		productos.addAll(getProductosB());
		return productos;
	}
	
	private List<Producto> getProductosA() {
		List<Producto> productos = new ArrayList<Producto>();
		Producto productoA = new Producto();
		productoA.setNumeroProducto("12345");
		productoA.setProducto("Tarjeta Debito");
		productoA.setRegistrar("SI");
		productos.add(productoA);

		Producto productoB = new Producto();
		productoB.setNumeroProducto("67890");
		productoB.setProducto("Tarjeta Credito");
		productoB.setRegistrar("SI");
		productos.add(productoB);
		return productos;
	}

	private List<Producto> getProductosB() {
		List<Producto> productos = new ArrayList<Producto>();
		Producto productoA = new Producto();
		productoA.setNumeroProducto("7712662");
		productoA.setProducto("Caja de Ahorro Pesos");
		productoA.setRegistrar("SI");
		productos.add(productoA);

		Producto productoB = new Producto();
		productoB.setNumeroProducto("1277381");
		productoB.setProducto("Cuenta Corriente Pesos");
		productoB.setRegistrar("SI");
		productos.add(productoB);
		return productos;
	}

	private List<Telefono> getTelefonosA() {
		List<Telefono> telefonos = new ArrayList<Telefono>();
		Telefono telefono1 = new Telefono();
		telefono1.setTipo("Laboral (2)");
		telefono1.setNumero("1135433543");
		telefonos.add(telefono1);
		Telefono telefono2 = new Telefono();
		telefono2.setTipo("Fijo (Cónyugue)");
		telefono2.setNumero("35112818281");
		telefonos.add(telefono2);
		return telefonos;
	}

	private List<Telefono> getTelefonosB() {
		List<Telefono> telefonos = new ArrayList<Telefono>();
		Telefono telefono1 = new Telefono();
		telefono1.setTipo("Laboral (2)");
		telefono1.setNumero("1143219876");
		telefonos.add(telefono1);
		Telefono telefono2 = new Telefono();
		telefono2.setTipo("Fijo (Cónyugue)");
		telefono2.setNumero("1123456789");
		telefonos.add(telefono2);
		return telefonos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
