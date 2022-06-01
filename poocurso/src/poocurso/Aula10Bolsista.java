package poocurso;

public class Aula10Bolsista extends Aula10Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " � bolsista! Pagamento facilitado!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
