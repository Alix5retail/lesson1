package lesson4.task2;

public class SportCar extends Car {
    private double speed;

    public SportCar(String model, String classAuto, int weight, Engine engine, double speed) {
        super(model, classAuto, weight, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель: " + super.getModel() + ". Класс: " + super.getClassAuto()
                + ". Вес: " + super.getWeight() + ". Максимальная скорость: " + getSpeed() + " км/ч"
                + "Мотор. Мощность: " + super.getEngine().getPower() + " лощадинных сил. Производитель: "
                + super.getEngine().getManufacturer());
    }
}
