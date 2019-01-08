package se.lexicon.teresia.practice_employee;

/**
 * Hello world!
 *
 */
public class EmployeeMainApp 
{
    public static void main( String[] args )
    {

    	SystemDeveloper sysdev1 = new SystemDeveloper(123,"Nisse", 2, 5);    	
    	SalesPerson seller1 = new SalesPerson(124, "Sigurd", 5,2);
    	
    	System.out.println(seller1);
    	seller1.addClient(2, true);
    	System.out.println(seller1);
    	seller1.addClient(1, false);
    	System.out.println(seller1);
    	
    	sysdev1.addKnowledge(0, 1);
    	
    }
}
