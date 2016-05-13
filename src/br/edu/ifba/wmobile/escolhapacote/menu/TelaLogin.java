package br.edu.ifba.wmobile.escolhaseupacote.menu;

import java.util.ArrayList;
import java.util.List;


public class TelaLogin {
	private List<String> dadosLogin=new ArrayList<String>();
	
	
	public void setLoginNome(String nome){
		dadosLogin.add(nome);
	}
	public void setLoginSobrenome(String sobrenome){
		dadosLogin.add(sobrenome);
	}
	public void setLoginEmail(String email){
		dadosLogin.add(email);
	}
	public void setLoginTel(String tel){
		dadosLogin.add(tel);
	}
	
	public List<String> getLogin(){
		return dadosLogin;
	}
}
