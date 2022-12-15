package model;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	//private String local;
	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	//private int capacidade;
	//private int quantidade;
	
	
	public Biblioteca() {	
			//listaLivros = new ArrayList<Livro>();
	}
	
	public Biblioteca(String nome, String titulo, String autor) {
		super(titulo, autor);
		this.nome = nome;
	}
	
	
	public String getNome() {
		System.out.println("Bem vindo à SARAIVA!!");
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	
	
	
	
	
	
	
	
	
	
	//public String getLocal() {
	//	return local;
	//}
	///public void setLocal(String local) {
	//	this.local = local;
	//}
	
	//public int getCapacidade() {
	//	return capacidade;
	//}
	///public void setCapacidade(int capacidade) {
	//	this.capacidade = capacidade;
	//}
	//public int getQuantidade() {
	//	return quantidade;
	//}
	//public void setQuantidade(int quantidade) {
	//	this.quantidade = quantidade;
	//}
	
	

}
