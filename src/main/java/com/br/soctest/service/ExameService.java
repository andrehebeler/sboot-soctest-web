package com.br.soctest.service;

import java.util.List;

import com.br.soctest.model.Exame;

public interface ExameService {
	
	public List<Exame> getExames();

	public List<Exame> insertOrUpdateExame(Exame exame);

	public List<Exame> deleteExame(String id);

}
