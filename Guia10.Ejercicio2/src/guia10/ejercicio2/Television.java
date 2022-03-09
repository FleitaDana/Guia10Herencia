
package guia10.ejercicio2;


public class Television extends Appliance{
    
    private int resolution;
    private boolean tunerTdt;

    public Television() {
    }

    public Television(int resolution, boolean tunerTdt, Double price, String colour, char energyConsumption, int weight) {
        super(price, colour, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTdt = tunerTdt;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTunerTdt() {
        return tunerTdt;
    }

    public void setTunerTdt(boolean tunerTdt) {
        this.tunerTdt = tunerTdt;
    }
    
    public void createTelevision() {
        createAppliance();
        System.out.println("Resolucion del televisor en pulgadas: ");
        this.resolution = entry.nextInt();
        System.out.println("Sintonizador TDT (true/false): ");
        this.tunerTdt = entry.nextBoolean();
    }
    
    @Override
    public void finalPrice(){
        super.finalPrice();
        if (resolution > 40){
            price += price*0.3;
        }
        if (tunerTdt){
            price += 500;
        }
        
        System.out.println("El precio final es: " + price);
    }
    
    
}
