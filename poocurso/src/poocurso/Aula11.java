package poocurso;

public class Aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Aula11Mamifero m = new Aula11Mamifero();
		Aula11Reptil r = new Aula11Reptil();
		Aula11Peixe p = new Aula11Peixe();
		Aula11Ave a = new Aula11Ave();
		Aula11Canguru c = new Aula11Canguru();
		Aula11Cachorro k = new Aula11Cachorro();
		Aula11Cobra	j = new Aula11Cobra();
		Aula11Tartaruga t = new Aula11Tartaruga();
		Aula11GoldFish g = new Aula11GoldFish();
		Aula11Arara	e = new Aula11Arara();
		
		
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		
		
		
		
	}

}
