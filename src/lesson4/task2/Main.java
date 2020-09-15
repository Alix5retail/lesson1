package lesson4.task2;

public class Main {
    public static void main(String[] args) {

        Car lorry = new Lorry("BMW Lorry X", "C", 6500, new Engine(2500, "Veyron"), 3000);
        lorry.start();
        lorry.stop();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.printInfo();
        System.out.println();

        Car sportCar = new SportCar("Ferrari la ferrari", "A", 1200, new Engine(1800, "Ferrari"), 450);
        sportCar.start();
        sportCar.stop();
        sportCar.turnRight();
        sportCar.turnLeft();
        sportCar.printInfo();
    }
}
