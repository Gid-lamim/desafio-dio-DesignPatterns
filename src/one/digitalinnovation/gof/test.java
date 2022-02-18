package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Strategy.*;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.facade.Facade;

public class test {
    public static void main(String[] args) {
        //LAZY
        System.out.println("Lazy");
        //instanciar um singleton é feito pela classe. Não usa o 'new'. no caso "preguiçoso", a classe é instanciada ao ser chamada.
        SingletonLazy lazy = SingletonLazy.getInstancia(); // o metodo getInstancia instancia a classe.
        System.out.println(lazy);

        //se for chamada novamente, ela reconhece, atraves do "if (instancia == null)", que a classe já foi intanciada anteriormente.
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        System.out.println( );


        // Strategia do robô
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategia(normal);//a instancia da classe ComportamentoNormal() é passada como parâmetro
        robo.mover();
        robo.setStrategia(defensivo);
        robo.mover();
        robo.setStrategia(agressivo);
        robo.mover();
        robo.setStrategia(normal);
        robo.mover();

        //testando a facade
        //Modificada para singleton
        Facade facade = Facade.getFacade();
        facade.migrarCliente("Glamim","18077565");

    }
}
