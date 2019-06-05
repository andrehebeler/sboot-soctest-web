package com.br.soctest.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.soctest.dao.ExameDao;
import com.br.soctest.model.Exame;
import com.br.soctest.service.ExameService;

@Component
public class ExameDaoImpl implements ExameDao {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ExameService exameService;

	@Override
	public List<Exame> getExames() {
		logger.info(" ExameDaoImpl - getExames");
		return exameService.getExames();
	}

	@Override
	public List<Exame> insertOrUpdateExame(Exame exame) {
		logger.info(" ExameDaoImpl - getExames");
		return exameService.insertOrUpdateExame(exame);
	}

	@Override
	public List<Exame> deleteExame(String id) {
		logger.info(" ExameDaoImpl - getExames");
		return exameService.deleteExame(id);
	}

}
