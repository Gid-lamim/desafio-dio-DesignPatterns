package one.digitalinnovation.gof.Strategy;

public class Robo {
	
	private Comportamento strategia;

	public void setStrategia(Comportamento strategia) {
		this.strategia = strategia;
	}
	
	public void mover() {
		strategia.mover();
	}
}
