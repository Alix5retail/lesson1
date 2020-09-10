package lesson3.animal;

public class Vet {

    public void treatAnimal(Animal animal){
        System.out.println("Это животное ест: " + animal.eat());
        System.out.println("Это животное из: " + animal.getLocation());
    }
}
