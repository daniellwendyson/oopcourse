package poocurso;

public class Aula10Tecnico extends Aula10Aluno {
	private int registroProfissional;
	
	public void praticar() {
		System.out.println("Aluno está praticando..");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	
}
