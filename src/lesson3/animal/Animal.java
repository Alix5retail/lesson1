package lesson3.animal;

public class Animal {

    public String food;
    public String location;

    public Animal(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Это животное шумит");
    }

    public String eat() {
        return "Это животное ест" + food;
    }

    public void sleep() {
        System.out.println("Это животное спит");
    }
}
