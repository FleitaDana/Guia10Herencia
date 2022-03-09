
package guia10.ejercicio1;


public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, String food, int age, String race) {
        super(name, food, age, race);
    }
    
    @Override
    public void feed() {
        System.out.println("El gato " + name+ " come " + food);
    }
}
