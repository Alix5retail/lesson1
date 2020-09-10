package lesson3.animal;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Cat("Leopold", "Мяукает", "Кошачий корм"),
                new Dog("Mikki", "Гавкает", "Собачий корм"),
                new Horse("Jack", "Кричит", "Лощадинный корм")};

        Vet vet = new Vet();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
