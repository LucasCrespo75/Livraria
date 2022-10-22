package interfaceMet;

import java.util.List;

import model.Livro;

public interface LivroMet {
	
	public void adicionarLivro(Livro livro);
	
	public Livro obterLivroTitu(String titulo);
	
	public LivroMet obterLivroAut(String autor);
	
	public void removerLivro(String titulo);
	
	public List<Livro> listaLivros();
	
	

}
