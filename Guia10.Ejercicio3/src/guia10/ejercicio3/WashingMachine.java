
package guia10.ejercicio3;


public class WashingMachine extends Appliance{
    
    private Double load;

    public WashingMachine() {
    }

    public WashingMachine(Double load) {
        this.load = load;
    }

    public WashingMachine(Double load, Double price, String colour, char energyConsumption, int weight) {
        super(price, colour, energyConsumption, weight);
        this.load = load;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }
    
    public void createLoad() {
        createAppliance();
        System.out.println("Carga de la lavadora: ");
        this.load = entry.nextDouble();
    }

    @Override
    public void finalPrice() {
        super.finalPrice(); 
         if (load > 30){
             price += 500;
         }
         System.out.println("El precio final es: " + price);
    }
    
    
    
}
