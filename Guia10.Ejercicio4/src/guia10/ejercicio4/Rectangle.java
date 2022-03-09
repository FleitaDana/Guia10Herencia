
package guia10.ejercicio4;

import java.util.Locale;
import java.util.Scanner;


public class Rectangle implements CalculationsForms{
    
    private double base;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public void dataRectangle() {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese base del rectangulo");
        base = entry.nextDouble();
        System.out.println("Ingrese height del rectangulo");
        height = entry.nextDouble();
        perimeter();
        area();
    }

    @Override
    public void perimeter() {
        System.out.printf("El perimetro del rectangulo es: %.2f \n", (this.height + this.base) * 2);
    }

    @Override
    public void area() {
        System.out.printf("El area del rectangulo es: %.2f \n", this.height * this.base);
    }
}
