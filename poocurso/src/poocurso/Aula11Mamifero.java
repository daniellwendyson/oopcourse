package poocurso;

public class Aula11Mamifero extends Aula11Animal {
	private String corPelo;
	
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de mam�fero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
}
 