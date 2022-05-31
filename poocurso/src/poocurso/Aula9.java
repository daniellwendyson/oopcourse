package poocurso;

public class Aula9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula9Pessoa p1 = new Aula9Pessoa();
		Aula9Aluno p2 = new Aula9Aluno();
		Aula9Professor p3 = new Aula9Professor();
		Aula9Funcionario p4 = new Aula9Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
