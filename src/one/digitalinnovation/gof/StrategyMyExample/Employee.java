package one.digitalinnovation.gof.StrategyMyExample;

import one.digitalinnovation.gof.StrategyMyExample.Emplyees.Role;

/**
 * classes are the blueprints for new objects.
 * Exemplo feito através de um video
 * @see <a href="https://www.youtube.com/watch?v=F7_cRqNKoJs">Strategy pattern</a>
 */

public class Employee {
    private String name;
    private Role role;

    public Employee (String name, Role role) {
    	this.name = name;
    	this.role = role;
    }

    //we can get the employee a promotion
    public void promote(Role newRole) {
        role = newRole;
    }
    
    //we can see the employee's job description
    public String grade() {
    	return this.name + " is a " + role.description();
    }
    
    // we can ask the employee to perform their role
    public void doWork(){
        System.out.println(name + " will " + role.responsabilities());
    }

}
