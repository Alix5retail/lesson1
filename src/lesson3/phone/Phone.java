package lesson3.phone;

public class Phone {

    private int number;
    private int weight;
    private String model;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Имя звонящего: " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Имя звонящего: " + name + ". Номер звонящего: " + number);
    }

    public void sendMessage(int... n) {
        for (int i : n) {
            System.out.println(i);
        }
    }
}
