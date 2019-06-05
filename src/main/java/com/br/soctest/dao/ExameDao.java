package com.br.soctest.dao;

import java.util.List;

import com.br.soctest.model.Exame;

public interface ExameDao {
	
	public List<Exame> getExames();
	
	public List<Exame> insertOrUpdateExame(Exame exame);
	
	public List<Exame> deleteExame(String id);

}
