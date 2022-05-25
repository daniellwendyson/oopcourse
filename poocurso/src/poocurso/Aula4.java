package poocurso;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula4Caneta c1 = new Aula4Caneta("NIC", "Amarelo", 0.4f);
		
		Aula4Caneta c2 = new Aula4Caneta("BIC", "Azul", 1.5f);
		
		// c1.setModelo("BIC");
		// c1.modelo = "BIC";
		
		// c1.setPonta(0.5f);
		// c1.ponta = 0.5f;
		
		c1.status();
		c2.status();
		
		// System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
		
		
	}

}
