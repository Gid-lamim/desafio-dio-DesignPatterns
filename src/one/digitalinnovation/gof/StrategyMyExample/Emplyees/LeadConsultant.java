package one.digitalinnovation.gof.StrategyMyExample.Emplyees;


public class LeadConsultant implements Role{
	
    public String description() {
        return LeadConsultant.class.getSimpleName();
    }
    
    public String responsabilities(){
    	return "makes tech decisions";
    }

}
