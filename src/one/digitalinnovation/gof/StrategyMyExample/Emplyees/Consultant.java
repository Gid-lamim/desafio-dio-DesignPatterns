package one.digitalinnovation.gof.StrategyMyExample.Emplyees;


public class Consultant implements Role{
	
    public String description() {
        return Consultant.class.getSimpleName();
    }
    
    public String responsabilities(){
    	return "write code";
    }
}
