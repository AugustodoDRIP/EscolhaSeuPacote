package br.edu.ifba.wmobile.escolhapacote.menu;

import java.util.ArrayList;
import java.util.List;

public class Pacote1 implements IPacote{

	@Override
	public String getNome() {
		return "Pacote 1: Economico";
	}

	@Override
	public List<String> getServicos() {
		List<String> servicos = new ArrayList<String>();
		servicos.add("Planta do Projeto");
		servicos.add("Fundações");
		servicos.add("Alvenaria");
		servicos.add("Telhado ou laje");
		return servicos;
	}

	@Override
	public double getPreco() {
		return 5.000;
	}
	
	
}
