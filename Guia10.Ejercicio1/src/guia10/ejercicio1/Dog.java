
package guia10.ejercicio1;


public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String food, int age, String race) {
        super(name, food, age, race);
    }

    @Override
    public void feed() {
        System.out.println("El perro " + name+ " come " + food);
    }
    
}
