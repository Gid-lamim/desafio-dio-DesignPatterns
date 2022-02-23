package one.digitalinnovation.gof.StrategyMyExample.Emplyees;


public class SeniorConsultant implements Role{
	
    public String description() {
        return SeniorConsultant.class.getSimpleName();
    }
    
    public String responsabilities(){
    	return "review code";
    }

}
