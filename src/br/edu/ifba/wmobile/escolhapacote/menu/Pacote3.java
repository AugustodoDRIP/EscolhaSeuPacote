package br.edu.ifba.wmobile.escolhapacote.menu;

import java.util.List;

public class Pacote3 implements IPacote{

	private IPacote anterior;
	
	public Pacote3(IPacote anterior){
		this.anterior = anterior;
	}
	@Override
	public String getNome() {
		return "Pacote 3: M�dio";
	}
	@Override
	public List<String> getServicos() {
		List<String> servicos = anterior.getServicos();
		servicos.add("Instala��es el�tricas");
		servicos.add("Instala��es hidr�ulicas");
		return servicos;
	}
	@Override
	public double getPreco() {
		return anterior.getPreco() + 2.100;
	}

}
