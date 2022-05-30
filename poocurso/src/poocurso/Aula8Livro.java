package poocurso;

public class Aula8Livro implements Aula8Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Aula8Pessoa leitor;
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + "\n, totPaginas=" + totPaginas + ", pagAtual="
				+ pagAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() +"]";
	}

	public Aula8Livro(String titulo, String autor, int totPaginas, Aula8Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Aula8Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Aula8Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if (p > this.totPaginas) {
			this.pagAtual = 0;
		}else {
			this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.pagAtual--;
	}
	
	
}
