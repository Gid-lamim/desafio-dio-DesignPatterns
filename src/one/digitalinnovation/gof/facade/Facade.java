package one.digitalinnovation.gof.facade;
/**
 * Facade is a structural design pattern that provides a
 * simplified (but limited) interface to a complex system
 * of classes, library or framework. While Facade decreases
 * the overall complexity of the application, it also helps
 * to move unwanted dependencies to one place.
 */

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	private static Facade facade = new Facade();

	private Facade() {
		//super();
	}

	public static Facade getFacade() {
		return facade;
	}

	public void migrarCliente(String nome, String cep) {

		String cidade = CepApi.getInstancia().recuperarCidade(cep);//simula uma API
		String estado = CepApi.getInstancia().recuperarEstado(cep);//simula uma API
		CrmService.gravarCliente(nome, cep, cidade, estado);


	}
}
