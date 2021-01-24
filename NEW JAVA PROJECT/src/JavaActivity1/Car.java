package JavaActivity1;

public class Car {
	String Color; 
	String transmission;
	int make;
	int tyres;
	int doors; 
	
	 Car(){
	    	tyres=4;
		    doors=4;
          }
     public void displayCharacteristics() {
    	 System.out.println("The Car Color is :- "+ Color);
    	 System.out.println("The Car transmission happened through :- "+ transmission);
    	 System.out.println("The Car making yesr was :- "+ make);
    	 System.out.println("The number of car tyers:- "+ tyres);
    	 System.out.println("The number of Car door is :- "+ doors);
        }
     public void accelarate() {
    	 System.out.println("The Car is moving forward.");
     }
     public void brake() {
    	 System.out.println("Car has stopped.");
     }
}
