package poocurso;

public class Aula3Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("modelo: " + this.modelo);
		System.out.println("uma caneta " + this.cor);
		System.out.println("ponta: " + this.ponta);
		System.out.println("carga: " + this.carga);
		System.out.println("está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar!");
		}else {
			System.out.println("estou rabiscando!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
