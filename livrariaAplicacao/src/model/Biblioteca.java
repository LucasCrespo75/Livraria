package model;

import java.util.ArrayList;

public class Biblioteca extends Livro {
	
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
	
	public void adicionarLivro(String titulo, String autor) {
       // Biblioteca biblio = new Biblioteca();

		//livro = new Livro();
		//livro.getCodigo();
		//livro.setTitulo(livro.getTitulo());
		//livro.setAutor(livro.getAutor());
		//livro.getNumPag();
		//livro.getValorCompra();
		
		Livro livro = new Livro(titulo, autor);
		
		listaLivros.add(livro);
		
	}
	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
		
			
	}

	public Livro obterLivroTitu(String titulo) {
		for(int i = 0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getTitulo().equals(titulo)) {
				return listaLivros.get(i);
			}
		}
		
		return null;
	}
	
	public Livro obterLivroAut(String autor) {
		for(int i = 0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getAutor().equals(autor)) {
				return listaLivros.get(i);
			}
		}
		
		return null;
	}
	
	public void retornarTudo() {
		for(int i = 0; i < listaLivros.size(); i++) {
			System.out.println("Livro "+(i+1) + " - "+listaLivros.get(i).getTitulo());
		}
	}
	
	public void removerLivro(String titulo) {
		for(int i = 0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getTitulo().equals(titulo)) {
				listaLivros.remove(i);

			}
		}
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
