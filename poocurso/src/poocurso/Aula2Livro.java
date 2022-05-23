package poocurso;

public class Aula2Livro {
	String titulo;
	String editora;
	int edicao;
	int ano;
	String autor;
	String tipoCapa;
	int QtdeFolhas;
	String ISBN;
	String idioma;
	boolean aberto;
	
	void estudar() {
		if (this.aberto == false) {
			System.out.println("voc� n�o pode estudar, o livro est� fechado!");
		}else {
			System.out.println("bons estudos!");
		}
	}
	
	void abrir() {
		this.aberto = true;
	}
	
	void fechar() {
		this.aberto = false;
	}
	
	void anotar() {
		if (this.aberto == false) {
			System.out.println("voc� precisa abrir antes de anotar!");
		}else {
			System.out.println("anotando..");
		}
	}
	
	void status() {
		System.out.println("t�tulo: "+this.titulo);
		System.out.println("editora: "+this.editora);
		System.out.println("edi��o: "+this.edicao);
		System.out.println("ano: "+this.ano);
		System.out.println("tipo de capa: "+this.tipoCapa);
		System.out.println("quantidade de folhas: "+this.QtdeFolhas);
		System.out.println("ISBN: "+this.ISBN);
		System.out.println("idioma: "+this.idioma);
		if (aberto) {
			System.out.println("o livro est� aberto");
		}else {
			System.out.println("o livro est� fechado");
		}
	}
	
}
