package br.edu.ifba.wmobile.escolhaseupacote.menu;

import java.util.List;

/* Author Andre Daniel Sobreira */

public class Pacote3 implements IPacote{

	private IPacote anterior;
	
	public Pacote3(IPacote anterior){
		this.anterior = anterior;
	}
	@Override
	public String getNome() {
		return "Pacote 3: Médio";
	}
	@Override
	public List<String> getServicos() {
		List<String> servicos = anterior.getServicos();
		servicos.add("Instalações elétricas");
		servicos.add("Instalações hidráulicas");
		return servicos;
	}
	@Override
	public double getPreco() {
		return anterior.getPreco() + 2100;
	}

}
