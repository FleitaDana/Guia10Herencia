package guia10.ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Appliance {

    Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US); 
    
    protected Double price;
    protected String colour;
    protected char energyConsumption;
    protected int weight;

    public Appliance() {
    }

    public Appliance(Double price, String colour, char energyConsumption, int weight) {
        this.price = price;
        this.colour = colour;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int  getWeight() {
        return weight;
    }

    public void setWeight(int  weight) {
        this.weight = weight;
    }

    public void checkEnergyConsumption(char energyConsumption) {
        if (this.energyConsumption < 65 && this.energyConsumption > 70) {
            this.energyConsumption = 70;
        }
    }

    public void checkColour(String colour) {
        colour = colour.toUpperCase();

        if (!colour.equals("blanco") || !colour.equals("negro") || !colour.equals("rojo") || !colour.equals("azul") || !colour.equals("gris")){
            this.colour = "blanco";
        }
    }
    
    public void createAppliance() {
        
        System.out.println("Ingrese datos; ");
        this.price= 1000.00;
        System.out.println("Color: ");
        this.colour = entry.next();
        checkColour(colour);
        System.out.println("El color de la lavadora es: " + this.colour);
        System.out.println("Consumo energetico (elija una letra de A a la F): ");
        this.energyConsumption  = entry.next().charAt(0);
        checkEnergyConsumption(energyConsumption);
        System.out.println("La letra elegida es: " + this.energyConsumption);
        System.out.println("Peso: ");
        this.weight = entry.nextInt();
    }
    
    public void finalPrice() {
        
         switch (this.energyConsumption) {
            case 'A':
                this.price += 1000;
                break;
            case 'B':
                this.price += 800;
                break;
            case 'C':
                this.price += 600;
                break;
            case 'D':
                this.price += 500;
                break;
            case 'E':
                this.price += 300;
                break;
            case 'F':
                this.price += 100;
                break;
        }
         
        if (this.weight>=1 && this.weight<=19) {
            this.price += 100;
        }else if( this.weight>20 && this.weight<=49){
            this.price += 500;
        }else if(this.weight>50 && this.weight<=79){
            this.price += 800;
        }else{
            this.price += 1000;
        }    
    }
    
    
}
