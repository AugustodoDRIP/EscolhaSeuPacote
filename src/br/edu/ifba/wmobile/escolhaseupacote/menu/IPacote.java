package br.edu.ifba.wmobile.escolhaseupacote.menu;

import java.util.List;

/* Author Andre Daniel Sobreira */

public interface IPacote {
	public String getNome();
	public List<String> getServicos();
	public double getPreco();
}
