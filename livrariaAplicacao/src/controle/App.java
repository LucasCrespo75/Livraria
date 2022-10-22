package controle;

import model.Biblioteca;
import model.Livro;

public class App {
	
	public static void main (String args[]) {
		//Scanner sc = new Scanner(System.in);
		
		Biblioteca bibli = new Biblioteca();
		bibli.getNome();
		//adicionando um livro partindo do metodo String titulo, String autor
		Livro livro1 = new Livro("Douglas o menino morto", "Tynah Guedes");
		bibli.adicionarLivro(livro1);
		
		//adicionando um livro partindo o metodo Livro livro
		bibli.adicionarLivro("AUTO DA COMPADECIDA", "LUCAS CRESPO");
		System.out.println("Titulo: "+bibli.obterLivroTitu("AUTO DA COMPADECIDA" ).getTitulo());
		System.out.println("Autor: "+bibli.obterLivroAut("LUCAS CRESPO").getAutor());
		
		bibli.retornarTudo();
		
		System.out.println("Removendo livro escolhido..... ");
		bibli.removerLivro("AUTO DA COMPADECIDA");
		
		bibli.retornarTudo();
		

	}
}

