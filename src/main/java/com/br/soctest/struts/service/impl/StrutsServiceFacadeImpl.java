package com.br.soctest.struts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.soctest.dao.ExameDao;
import com.br.soctest.model.Exame;
import com.br.soctest.struts.service.StrutsServiceFacade;

@Service("exameService")
public class StrutsServiceFacadeImpl implements StrutsServiceFacade {
	
	@Autowired
    private ExameDao exameDao;

	@Override
	public Object doService(Object... args) throws Exception {
		if(args[0].equals("get")){
            return exameDao.getExames();
        } else if(args[0].equals("insert")) {
        	return exameDao.insertOrUpdateExame((Exame)args[1]);
        } else if(args[0].equals("update")) {
        	return exameDao.insertOrUpdateExame((Exame)args[1]);
        } else if(args[0].equals("delete")) {
        	return exameDao.deleteExame((String)args[1]);
        }
		return null;
	}

}
