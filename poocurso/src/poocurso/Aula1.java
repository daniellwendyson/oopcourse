package poocurso;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula1Caneta c1 = new Aula1Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		
		System.out.println("----------------------------");
		
		Aula1Caneta c2 = new Aula1Caneta();
		c2.modelo = "hostnet";
		c2.cor = "preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		
	}

}
