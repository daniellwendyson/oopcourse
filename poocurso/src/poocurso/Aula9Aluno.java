package poocurso;

public class Aula9Aluno extends Aula9Pessoa {
	private int mat;
	private String curso;
	
	public void cancelarMatr() {
		System.out.println("Matr�cula ser� cancelada!");
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
