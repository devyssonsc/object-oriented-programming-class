/**
 * 
 */
package clube;

/**
 * 
 */
public class Futebol extends Modalidade {
	private String nomeTreinador;
	private String estadio;
	/**
	 * @param nome
	 * @param escalao
	 * @param nomeTreinador
	 * @param estadio
	 */
	public Futebol(String nome, String escalao, String nomeTreinador, String estadio) {
		super(nome, escalao);
		this.nomeTreinador = nomeTreinador;
		this.estadio = estadio;
	}
	/**
	 * @return the nomeTreinador
	 */
	public String getNomeTreinador() {
		return nomeTreinador;
	}
	/**
	 * @return the estadio
	 */
	public String getEstadio() {
		return estadio;
	}
	@Override
	public String toString() {
		return "Futebol " + super.toString() + " [nomeTreinador=" + nomeTreinador + ", estadio=" + estadio + "]";
	}
	
	
}
