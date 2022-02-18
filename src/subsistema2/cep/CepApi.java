package subsistema2.cep;

/**
 * esta classe será um singleton apressado pois, ao ser iniciada, ela já instancia ela msma
 *
 */

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Sorocaba";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
