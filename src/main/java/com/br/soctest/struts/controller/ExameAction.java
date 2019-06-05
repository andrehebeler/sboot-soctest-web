package com.br.soctest.struts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.soctest.model.Exame;
import com.br.soctest.struts.service.StrutsServiceFacade;
import com.opensymphony.xwork2.ActionSupport;

@Component
public class ExameAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
    private List<Exame> exames;
     
    @Autowired
    private StrutsServiceFacade service;
     
    @SuppressWarnings("unchecked")
    public String execute() throws Exception {
    	exames = (List<Exame>) service.doService("get");
        return SUCCESS;
    }
 
    public List<Exame> getExames(){
        return exames;
    }
	
}
