package lesson4.task2;

public abstract class Car {
    private String model;
    private String classAuto;
    private int weight;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, String classAuto, int weight, Engine engine) {
        this.model = model;
        this.classAuto = classAuto;
        this.weight = weight;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void start();

    public abstract void stop();

    public void turnRight(){
        System.out.println("Поворот направо");
    };

    public void turnLeft(){
        System.out.println("Поворот налево");
    };

    public abstract void printInfo();
}
