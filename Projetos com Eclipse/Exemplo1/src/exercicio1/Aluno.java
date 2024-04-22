package exercicio1;
/**
 * Esta classe descreve um Aluno
 * @author Devysson S. Cardoso
 * @version 21.04.2024
 */
public class Aluno {
	//Variáveis de instância
		private int numero;
		private String nome;
		
	/**
	 * @param Número de matrícula que será dado ao objeto do tipo Aluno
	 * @param Nome que será dado ao objeto do tipo Aluno
	 */
	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + "]";
	}
}
