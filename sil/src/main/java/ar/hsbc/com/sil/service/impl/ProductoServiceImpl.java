package ar.hsbc.com.sil.service.impl;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import ar.hsbc.com.sil.service.ProductoService;
import ar.hsbc.com.sil.service.cliente.Producto;
import ar.hsbc.com.sil.service.response.ProductoServiceResponse;
import ar.hsbc.com.sil.service.utils.ClienteUtils;

//Service Implementation Bean

@WebService(endpointInterface = "ar.hsbc.com.sil.service.ProductoService", serviceName = "ProductoService", portName = "ProductoServicePort")
@HandlerChain(file = "cliente-service-handle-chain.xml")
public class ProductoServiceImpl implements ProductoService {

	@Override
	public ProductoServiceResponse getProductosPorCliente(String dni) {
		ProductoServiceResponse productoService= new ProductoServiceResponse();
		productoService.setCodigo("1");
		productoService.setDescripcion("Faltan dato para la consulta: el campo DNI no puede ser vacío");
		if(!dni.isEmpty()){
			ClienteUtils clienteUtils = new ClienteUtils();
			productoService.setCodigo("2");
			productoService.setDescripcion("Producto no existe.");
			for (Producto producto : clienteUtils.getProductos()) {
				if (producto.getNumeroProducto().contains(dni)) {
					productoService.addProducto(producto);
					productoService.setCodigo("0");
					productoService.setDescripcion("");
				} 
			}
		}
		
		return productoService;
	}

}
