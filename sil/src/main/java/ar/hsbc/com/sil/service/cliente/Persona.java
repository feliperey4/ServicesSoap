package ar.hsbc.com.sil.service.cliente;

public class Persona {

	private String razonSocial;
	private String tipoDocumento;
	private String documento;
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@Override
	public String toString() {
		return "Persona [razonSocial=" + razonSocial + ", tipoDocumento="
				+ tipoDocumento + ", documento=" + documento + "]";
	}
	
	
	
}
