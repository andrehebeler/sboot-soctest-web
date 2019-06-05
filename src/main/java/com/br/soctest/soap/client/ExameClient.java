package com.br.soctest.soap.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.br.soctest.model.Exame;
import com.br.soctest.soap.wsdl.GetExamesRequest;
import com.br.soctest.soap.wsdl.GetExamesResponse;

public class ExameClient extends WebServiceGatewaySupport {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public GetExamesResponse getExames(Exame exame) {
		logger.info(" ExameClient - getExames");
		GetExamesRequest request = null;
		if (exame != null && exame.getId() != null) {
			request = new GetExamesRequest();
			request.getExame().setId(exame.getId());
		}

		GetExamesResponse response = (GetExamesResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8001/ws/exames", request,
						new SoapActionCallback(
								"http://localhost:8001/ws/GetCountryRequest"));

		return response;
	}

}
