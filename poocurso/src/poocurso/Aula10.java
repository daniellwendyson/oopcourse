package poocurso;

public class Aula10 {

	public static void main(String[] args) {
		
		// Aula10Pessoa p1 = new Aula10Pessoa();
		
		/*Aula10Visitante v1 = new Aula10Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());*/
		
		Aula10Aluno a1 = new Aula10Aluno();
		a1.setNome("Cl�udio");
		a1.setMatricula(1111);
		a1.setCurso("Inform�tica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Aula10Bolsista b1 = new Aula10Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
	}

}
