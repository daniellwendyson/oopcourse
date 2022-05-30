package poocurso;

public class Aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula8Pessoa[] p = new Aula8Pessoa[2];
		Aula8Livro[] l = new Aula8Livro[3];
		
		p[0] = new Aula8Pessoa("Pedro", 22, "M");
		p[1] = new Aula8Pessoa("Maria", 25, "F");
		
		l[0] = new Aula8Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Aula8Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
		l[2] = new Aula8Livro("Java Avançado", "Maria Foester", 800, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		
		System.out.println(l[0].detalhes());
		
	}

}
