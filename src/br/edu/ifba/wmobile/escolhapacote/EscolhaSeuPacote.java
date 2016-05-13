package br.edu.ifba.wmobile.escolhaseupacote;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.ifba.wmobile.escolhaseupacote.menu.IPacote;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote1;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote2;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote3;
import br.edu.ifba.wmobile.escolhaseupacote.menu.Pacote4;
import br.edu.ifba.wmobile.escolhaseupacote.menu.TelaLogin;

@ManagedBean(name="pacotes")
public class EscolhaSeuPacote {

	private String nome="";
	private static List<IPacote> menu = new ArrayList<IPacote>();
	private static TelaLogin usuario = new TelaLogin();
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
		System.out.println("O "+getPacote(n).getNome()+" foi escolhido por "+usuario.getLogin().get(n));
	}
	public void setLoginNome(String nome){
		this.nome=nome;
	}
}
