package lesson3.animal;

public class Vet {

    public void treatAnimal(Animal animal){
        System.out.println("Это животное " + animal.getClass().getSimpleName() +  " ест: " + animal.eat());
        System.out.println("Это животное " + animal.getClass().getSimpleName() + " из: " + animal.getLocation());
    }
}
