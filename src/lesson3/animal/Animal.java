package lesson3.animal;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
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
