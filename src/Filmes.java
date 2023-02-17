
public class Filmes {
	private int id;
	private String tituloDoFilme;
	private String duracao;
	private String genero;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.tituloDoFilme = titulo;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTituloDoFilme() {
		return tituloDoFilme;
	}

	public String getDuracao() {
		return duracao;
	}

	public String getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "ID do filme: " + this.id + ", Filme: " + this.tituloDoFilme.toUpperCase() + ", duração: " + this.duracao + " e gênero: "
				+ this.genero.toUpperCase() + " | ";
	}

}
