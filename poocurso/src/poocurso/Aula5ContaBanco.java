package poocurso;

public class Aula5ContaBanco {
	
	public void Aula5ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int NumConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public void estadoAtual() {
		System.out.println("---------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Salo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}
	
	
	public int getNumConta() {
		return this.NumConta;
	}

	public void setNumConta(int n) {
		this.NumConta = n;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro, erro ao fechar!");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta em d�bito!");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float v) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo()+ v);
			System.out.println("Dep�sito realizado com sucesso na conta de " + this.getDono());
		}else {
			System.out.println("Imposs�vel depositar em uma conta fechada!");
		}
	}
	
	public void sacar(float v) {
		if (this.isStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Imposs�vel sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.isStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Imposs�vel pagar!");
		}
	}
	
	
	
}
