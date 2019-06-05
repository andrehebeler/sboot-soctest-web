package com.br.soctest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.br.soctest.soap.client.ExameClient;

@Configuration
public class ExameClientConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("exames.wsdl");
		return marshaller;
	}

	@Bean
	public ExameClient countryClient(Jaxb2Marshaller marshaller) {
		ExameClient client = new ExameClient();
		client.setDefaultUri("http://localhost:8001/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
