
package guia10.ejercicio1;


public abstract class Animal {
    
    protected String name;
    protected String food;
    protected int age;
    protected String race;

    public Animal() {
    }

    public Animal(String name, String food, int age, String race) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
    public abstract void feed();
}
