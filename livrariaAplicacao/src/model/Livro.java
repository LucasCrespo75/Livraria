package model;

public class Livro{
	
	//private int codigo;
	private String titulo;
	private String autor;
	//private String ISBN;
	//private int numPag;
	//private double valorCompra;
	
	public Livro() {
		
	}
	
	public Livro( String titulo,String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//public int getCodigo() {
	//	return codigo;
	//}

	//public void setCodigo(int codigo) {
	//	this.codigo = codigo;
	//}


	//public String getISBN() {
		//return ISBN;
	//}

	//public void setISBN(String iSBN) {
	//	ISBN = iSBN;
	//}

	//public int getNumPag() {
	//	return numPag;
	//}

	//public void setNumPag(int numPag) {
	//	this.numPag = numPag;
	//}

	//public double getValorCompra() {
	//	return valorCompra;
	//}

	//public void setValorCompra(double valorCompra) {
	//	this.valorCompra = valorCompra;
	//}

}
