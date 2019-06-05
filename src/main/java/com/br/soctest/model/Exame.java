package com.br.soctest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exame {

	private String id;

	private String nome;

	private String resultado;

}
