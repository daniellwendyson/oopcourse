package poocurso;

public class Aula11Peixe extends Aula11Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo subst�ncias");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe n�o faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
	
}
