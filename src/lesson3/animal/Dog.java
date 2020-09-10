package lesson3.animal;

public class Dog extends Animal {

    public String location = "Америки";
    private String name;
    private String food;
    private String noise;

    public Dog(String name, String noise, String food) {
        super(food);
        this.food = food;
        this.name = name;
        this.noise = noise;
    }

    @Override
    public void makeNoise() {
        System.out.println(noise);
    }

    @Override
    public String eat() {
        return food;
    }

    @Override
    public void sleep() {
        System.out.println(name + " спит");
    }

    @Override
    public String getLocation() {
        return location;
    }
}
