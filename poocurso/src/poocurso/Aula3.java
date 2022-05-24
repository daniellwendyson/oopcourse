package poocurso;

public class Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula3Caneta c1 = new Aula3Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;
		c1.carga = 80;
		// c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
	}

}
