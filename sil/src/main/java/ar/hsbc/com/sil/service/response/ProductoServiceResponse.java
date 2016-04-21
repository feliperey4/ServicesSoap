package ar.hsbc.com.sil.service.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.hsbc.com.sil.service.cliente.Producto;

@XmlRootElement(name = "productosPorClienteResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductoServiceResponse extends ServiceResponse {

	@XmlElementWrapper(name = "productos")
	@XmlElement(name = "producto")
	private List<Producto> productos= new ArrayList<Producto>();

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void addProducto(Producto producto){
		productos.add(producto);
	}

}
