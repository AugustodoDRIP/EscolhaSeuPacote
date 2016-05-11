package br.edu.ifba.wmobile.escolhapacote.menu;

import java.util.List;

public interface IPacote {
	
	public String getNome();
	public List<String> getServicos();
	public double getPreco();
}
