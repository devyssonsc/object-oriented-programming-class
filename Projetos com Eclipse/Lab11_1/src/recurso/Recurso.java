package recurso;
/**
 * 
 */
import java.time.LocalDate;
/**
 * 
 */
public class Recurso {
	private String nome;
	private LocalDate data;
	
	/**
	 * @param nome
	 * @param data
	 */
	public Recurso(String nome) {
		this.nome = nome;
		data = LocalDate.now();
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", data=" + data + "]";
	}
}//fim da classe


