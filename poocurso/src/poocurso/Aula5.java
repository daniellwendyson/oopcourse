package poocurso;

public class Aula5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula5ContaBanco p1 = new Aula5ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(100);
		// p1.sacar(150);
		// p1.fecharConta();
		
		
		Aula5ContaBanco p2 = new Aula5ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
