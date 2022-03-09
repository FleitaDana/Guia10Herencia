
package guia10.ejercicio2;


public class Main {

    
    public static void main(String[] args) {
        
        WashingMachine washingMachine = new WashingMachine();
        System.out.println("Lavadora");
        washingMachine.createLoad();
        washingMachine.finalPrice();
        
        Television television = new Television();
        System.out.println("Televisor");
        television.createTelevision();
        television.finalPrice();
    }
    
}
