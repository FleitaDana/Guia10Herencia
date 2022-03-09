
package guia10.ejercicio1;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta*/

public class Main {

    
    public static void main(String[] args) {
        
        Animal dog = new Dog("Madi", "croquetas", 2, "maltes");
        dog.feed();
        
        Dog dogTwo = new Dog("Madi", "croquetas", 2, "maltes");
        dog.feed();
        
        Animal cat = new Cat("Puflito", "croquetas", 1, "siamés");
        cat.feed();
        
        Cat catTwo = new Cat("Puflito", "croquetas", 2, "siamés");
        cat.feed();
        
        Animal horse = new Horse("Jackson", "croquetas", 4, "appaloosa");
        dog.feed();
        horse.feed();
        
        Horse horseTwo = new Horse("Jackson", "croquetas", 4, "appaloosa");
        horse.feed();
    }
    
}
