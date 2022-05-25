package poocurso;

public class Aula4Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public Aula4Caneta(String m, String c, float p) { // método construtor
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("modelo: " + this.getModelo());
		System.out.println("ponta: " + this.getPonta());
		System.out.println("cor: " + this.getCor());
		System.out.println("tampada: " + this.isTampada());
	}
	
}
