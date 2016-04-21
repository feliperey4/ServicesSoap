package ar.hsbc.com.sil.service.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HandlerClienteServiceResponse implements SOAPHandler<SOAPMessageContext> {

	@Override
	public void close(MessageContext messageContext) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext messageContext) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext messageContext) {
		Boolean outboundProperty = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty.booleanValue()) {
			System.out.println("\nOutbound message:");
		} else {
			System.out.println("\nInbound message:");
		}

		try {
			System.out.println("** Text: " + messageContext.getMessage().getSOAPBody().getTextContent());
		} catch (SOAPException e) {
			// TODO: Manejar la excepcion
		}

		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
