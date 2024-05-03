/**
 * 
 */
package recurso;

/**
 * 
 */
public class RecursoInformacao extends Recurso {
	private String tipo;
	private String nomeAutor;
	
	/**
	 * @param nome
	 */
	public RecursoInformacao(String nome, String tipo, String nomeAutor) {
		super(nome);
		this.tipo = tipo;
		this.nomeAutor = nomeAutor;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the nomeAutor
	 */
	public String getNomeAutor() {
		return nomeAutor;
	}

	@Override
	public String toString() {
		return "RecursoInformacao " + super.toString() + "[tipo=" + tipo + ", nomeAutor=" + nomeAutor + "]";
	}
	
	
}//fim da classe
