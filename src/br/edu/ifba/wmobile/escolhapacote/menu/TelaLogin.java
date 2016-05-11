package br.edu.ifba.wmobile.escolhapacote.menu;

import java.util.ArrayList;
import java.util.List;

public class TelaLogin {
	private List<String> dadosLogin=new ArrayList<String>();
	
	public TelaLogin(){
		dadosLogin.add("nome");
		dadosLogin.add("sobrenome");
		dadosLogin.add("email");
		dadosLogin.add("tel");
	}
	public void setLogin(String nome, String sobrenome, String email, String tel){
		dadosLogin.set(0, nome);
		dadosLogin.set(1, sobrenome);
		dadosLogin.set(2, email);
		dadosLogin.set(3, tel);
	}
	public List<String> getLogin(){
		return dadosLogin;
	}
}
