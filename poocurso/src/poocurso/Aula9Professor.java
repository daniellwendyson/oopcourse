package poocurso;

public class Aula9Professor extends Aula9Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aum) {
		this.salario += aum;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
