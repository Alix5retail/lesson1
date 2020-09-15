package lesson4.task2;

public class Lorry extends Car {
    private double loadCapacity;

    public Lorry(String model, String classAuto, int weight, Engine engine, double loadCapacity) {
        super(model, classAuto, weight, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель: " + super.getModel() + ". Класс: " + super.getClassAuto()
                + ". Вес: " + super.getWeight() + ". Грузоподъемность равна: " + getLoadCapacity() + " кг."
                + "Мотор. Мощность: " + super.getEngine().getPower() + " лощадинных сил. Производитель: "
                + super.getEngine().getManufacturer());
    }
}
