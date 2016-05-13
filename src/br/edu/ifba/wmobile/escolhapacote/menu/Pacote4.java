package br.edu.ifba.wmobile.escolhaseupacote.menu;

import java.util.List;

public class Pacote4 implements IPacote{

	private IPacote anterior;
	
	public Pacote4(IPacote anterior){
		this.anterior=anterior;
	}
	@Override
	public String getNome() {
		return "Pacote 4: Completo";
	}
	@Override
	public List<String> getServicos() {
		List<String> servicos = anterior.getServicos();
		servicos.add("Pintura");
		servicos.add("Jardim");
		return servicos;
	}
	@Override
	public double getPreco() {
		return anterior.getPreco() + 1700;
	}

}
