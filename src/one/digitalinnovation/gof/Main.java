package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Strategy.*;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.StrategyMyExample.Employee;
import one.digitalinnovation.gof.StrategyMyExample.Emplyees.Consultant;
import one.digitalinnovation.gof.StrategyMyExample.Emplyees.LeadConsultant;
import one.digitalinnovation.gof.StrategyMyExample.Emplyees.SeniorConsultant;
import one.digitalinnovation.gof.facade.Facade;



public class Main {

	public static void main(String[] args) {
	
		 //singleton ---------------------------------------------
		  //
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
        System.out.println("\n\n\n");
       
        
		/**
         * Test: Strategy pattern design
         * An example from a video
         * @see <a href="https://www.youtube.com/watch?v=F7_cRqNKoJs">Strategy pattern</a>
         *
         *names generated randomly at <a href="https://www.youtube.com/watch?v=F7_cRqNKoJs">names</a>
		 */
        
		Employee gabrielleBall = new Employee("Gabrielle Ball", new Consultant());
		Employee ireneSmith = new Employee("Irene Smith", new LeadConsultant());
		Employee lucasDickens = new Employee("Lucas Dickens", new SeniorConsultant());
		Employee samManning = new Employee("Sam Manning", new Consultant());
		Employee mattSanderson = new Employee("Matt Sanderson", new Consultant());
		Employee connorFerguson = new Employee("Connor Ferguson", new Consultant());
		
		//first let's ask'em to do something. Y'know, somebody's gotta do something.
		System.out.println("Let's ask'em to work");
		gabrielleBall.doWork();
		ireneSmith.doWork();
		lucasDickens.doWork();
		samManning.doWork();
		mattSanderson.doWork();
		connorFerguson.doWork();
		
		//now we need another Senior consultant, so we decided to give this role to Sam Manning 
		System.out.println("\n\n\nwe need Sam Manning to be a Senior Consultant now");
		System.out.println("=====before the promotion=====");
		System.out.println(samManning.grade());
		samManning.promote(new SeniorConsultant());
		System.out.println("\n=====after the promotion=====");
		System.out.println(samManning.grade());

	}
}
