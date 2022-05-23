package poocurso;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula2Livro l1 = new Aula2Livro();
		l1.titulo = "Use a cabeça! Java";
		l1.editora = "Alta Books";
		l1.edicao = 2;
		l1.ano = 2007;
		l1.autor = "Kathy Sierra";
		l1.tipoCapa = "Brochura";
		l1.QtdeFolhas = 796;
		l1.ISBN = "9788576081739";
		l1.idioma = "Português";
		
		l1.fechar();
		l1.estudar();
		System.out.println("*****STATUS*****");
		l1.status();
		System.out.println("****************");
		
	}

}
