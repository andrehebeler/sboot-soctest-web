package com.br.soctest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.soctest.model.Exame;
import com.br.soctest.service.ExameService;
import com.br.soctest.soap.client.ExameClient;
import com.br.soctest.soap.wsdl.GetExamesResponse;

@Component
public class ExameServiceImpl implements ExameService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ExameClient exameClient;

	@Override
	public List<Exame> getExames() {
		logger.info(" ExameServiceImpl - getExames");
		GetExamesResponse response = exameClient.getExames(null);
		if(response.getExames() != null) {
			List<Exame> exames = new ArrayList<>();
			response.getExames().forEach(exameResponse -> exames.add(new Exame(exameResponse.getId(), exameResponse.getNome(), exameResponse.getResultado())));
			return exames;
		}
		return null;
	}

	@Override
	public List<Exame> insertOrUpdateExame(Exame exame) {
		// TODO Consumir WS SOAP insertOrUpdateExame
		return getExames();
	}

	@Override
	public List<Exame> deleteExame(String id) {
		// TODO Consumir WS SOAP deleteExame
		return getExames();
	}

}
