
package guia10.ejercicio3;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
     
        double accumulatorWashingMachine= 0;
        double accumulatorTelevision = 0;
        
        List<Appliance> appliances = new ArrayList<>();
        
        WashingMachine washingMachine = new WashingMachine(40d, 1000d, "blanco" , 'a', 30);
        appliances.add(washingMachine);
        washingMachine.finalPrice();
        
        WashingMachine washingMachineTwo = new WashingMachine(40d, 1000.00,"verde", 'a', 30);
        appliances.add(washingMachineTwo);
         washingMachineTwo.finalPrice();
         
        Television television = new Television (40, true, 1000d, "blanco" , 'f', 30);
        appliances.add(television);
        television.finalPrice();
        
        Television televisionTwo = new Television (40, true, 1000d, "azul" , 'f', 30);
        appliances.add(televisionTwo);
        televisionTwo.finalPrice();
       
        
        for (Appliance appliance : appliances) {
            if (appliance instanceof WashingMachine){
                accumulatorWashingMachine += appliance.getPrice();
            } else {
                accumulatorTelevision += appliance.getPrice();
            }
        }
        System.out.println("El precio todas las lavadoras es; " +  accumulatorWashingMachine);
        System.out.println("El precio de todos los televisores es: " + accumulatorTelevision);
        System.out.println("El precio de todos los electrodomesticos es: " + (accumulatorWashingMachine + accumulatorTelevision));
        
        
        
        
        
    }
    
}
