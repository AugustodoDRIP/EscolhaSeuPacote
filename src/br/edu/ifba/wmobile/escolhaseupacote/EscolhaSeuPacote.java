package br.edu.ifba.wmobile.escolhaseupacote;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.wmobile.escolhaseupacote.menu.IPacote;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote1;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote2;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote3;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote4;

@ManagedBean(name="pacotes")
@SessionScoped
public class EscolhaSeuPacote {

	private String loginNome;
	private String loginSobrenome;
	private String loginEmail;
	private String loginTel;
	
	private static List<IPacote> menu = new ArrayList<IPacote>();
	
	static{
		IPacote pacote = new Pacote1();
		menu.add(pacote);
		pacote=new Pacote2(pacote);
		menu.add(pacote);
		pacote=new Pacote3(pacote);
		menu.add(pacote);
		pacote=new Pacote4(pacote);
		menu.add(pacote);
	}
	public String getNomeEmpresa(){
		return "&DS Construtora";
	}
	public String getNomeAplicacao(){
		return "Escolha seu Pacote";
	}
	public IPacote getPacote(int n){
		return menu.get(n-1);
	}
	public int getTotalItensMenu(){
		return menu.size();
	}
	public void escolher(int n){
		System.out.println("O \""+getPacote(n).getNome()+"\" foi escolhido por "+loginNome+" "+loginSobrenome
				+". "+"Email p/ contato: "+loginEmail+", Telefone: "+loginTel);
	}
	
	//GETTERS & SETTERS
	public String getLoginNome() {
		return loginNome;
	}
	public void setLoginNome(String loginNome) {
		this.loginNome = loginNome;
	}
	public String getLoginSobrenome() {
		return loginSobrenome;
	}
	public void setLoginSobrenome(String loginSobrenome) {
		this.loginSobrenome = loginSobrenome;
	}
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginTel() {
		return loginTel;
	}
	public void setLoginTel(String loginTel) {
		this.loginTel = loginTel;
	}
}
