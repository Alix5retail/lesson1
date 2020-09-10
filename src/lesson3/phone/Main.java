package lesson3.phone;

public class Main {
    public static void main(String[] args) {

        Phone iphone5 = new Phone();
        Phone iphone6 = new Phone();
        Phone iphone7 = new Phone();

        iphone5.setModel("Iphone 5");
        iphone5.setNumber(88001001);
        iphone5.setWeight(120);
        System.out.println(iphone5.getModel());
        System.out.println(iphone5.getNumber());
        System.out.println(iphone5.getWeight());
        iphone5.receiveCall("Ali", 88001001);
        System.out.println();

        iphone6.setModel("Iphone 6");
        iphone6.setNumber(88001002);
        iphone6.setWeight(121);
        System.out.println(iphone6.getModel());
        System.out.println(iphone6.getNumber());
        System.out.println(iphone6.getWeight());
        iphone5.receiveCall("Steve", 88001002);
        System.out.println();


        iphone7.setModel("Iphone 7");
        iphone7.setNumber(88001003);
        iphone7.setWeight(122);
        System.out.println(iphone7.getModel());
        System.out.println(iphone7.getNumber());
        System.out.println(iphone7.getWeight());
        iphone5.receiveCall("Mike", 88001003);

        Phone iphone8 = new Phone(88001004, "Iphone 8");
        Phone iphone10 = new Phone(88001005, "Iphone 10", 123);
    }
}
