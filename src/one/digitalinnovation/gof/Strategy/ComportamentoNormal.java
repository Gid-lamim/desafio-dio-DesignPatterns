package one.digitalinnovation.gof.Strategy;

public class ComportamentoNormal implements Comportamento{


    @Override
    public void mover() {
        System.out.println("Robô movendo-se normalmente.");
    }
}
