package recurso;
/**
 * 
 */

/**
 * 
 */
public class RecursoSoftware extends Recurso {
	private String version;
	private String url;
	
	/**
	 * @param nome
	 */
	public RecursoSoftware(String nome, String version, String url) {
		super(nome);
		this.version = version;
		this.url = url;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	@Override
	public String toString() {
		return "RecursoSoftware " + super.toString() + "[version=" + version + ", url=" + url + "]";
	}
	
	
}//fim da classe
