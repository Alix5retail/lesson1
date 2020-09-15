package lesson3.animal;

public class Cat extends Animal {

    private String name;
    private String food;
    private String noise;

    public Cat(String name, String noise, String food, String location) {
        super(food, location);
        this.food = food;
        this.name = name;
        this.noise = noise;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + ":" + noise);
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
        return super.getLocation();
    }
}
