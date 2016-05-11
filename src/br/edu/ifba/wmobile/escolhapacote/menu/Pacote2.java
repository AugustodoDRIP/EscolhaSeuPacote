package br.edu.ifba.wmobile.escolhapacote.menu;

import java.util.List;

public class Pacote2 implements IPacote{

	private IPacote anterior;
	
	public Pacote2(IPacote anterior){
		this.anterior=anterior;
	}
	@Override
	public String getNome() {
		return "Pacote 2: Básico";
	}
	@Override
	public List<String> getServicos() {
		List<String> servicos = anterior.getServicos();
		servicos.add("Carpintaria");
		servicos.add("Piso");
		return servicos;
	}
	@Override
	public double getPreco() {
		return anterior.getPreco() + 2.000;
	}

}
