
package guia10.ejercicio1;

public class Horse extends Animal{

    public Horse() {
    }

    public Horse(String name, String food, int age, String race) {
        super(name, food, age, race);
    }
    
    @Override
    public void feed() {
        System.out.println("El caballo " + name + " come " + food);
    }
}
