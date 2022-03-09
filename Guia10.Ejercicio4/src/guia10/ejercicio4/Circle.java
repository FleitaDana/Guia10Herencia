
package guia10.ejercicio4;

import java.util.Locale;
import java.util.Scanner;


public class Circle implements CalculationsForms{

    private double radio;

    public Circle() {
    }
    
    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    public void dataCircle() {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese radio del circulo");
        radio = entry.nextDouble();
        perimeter();
        area();
    }

    
    @Override
    public void perimeter() {
        System.out.printf("El perimetro del circulo es: %.2f \n", (2 * PI * this.radio));
    }

    @Override
    public void area() {
        System.out.printf("El area del circulo es %.2f \n", PI * Math.pow(radio, 2));
    }
    
}
