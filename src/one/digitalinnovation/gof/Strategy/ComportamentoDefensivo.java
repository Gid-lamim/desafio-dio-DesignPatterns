package one.digitalinnovation.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {

		System.out.println("Robô movendo-se defensivamente.");
	}

}
