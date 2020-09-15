package lesson3.phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Phone iphone5 = new Phone();
        Phone iphone6 = new Phone();
        Phone iphone7 = new Phone();

        Phone iphone8 = new Phone(88001004, "Iphone 8");
        Phone iphone10 = new Phone(88001005, "Iphone 10", 123);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(iphone5);
        phones.add(iphone6);
        phones.add(iphone7);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Steve");
        names.add("Mike");

        int countOfIphoneModel = 5;
        int countOfNumbers = 88000001;
        int countOfWeight = 120;
        int countOfNames = 0;

        for (Phone i : phones) {
            i.setModel("Iphone" + countOfIphoneModel);
            i.setNumber(countOfNumbers);
            i.setWeight(countOfWeight);
            i.receiveCall(names.get(countOfNames), countOfNumbers);
            countOfIphoneModel++;
            countOfNumbers++;
            countOfWeight++;
            countOfNames++;
            System.out.println();
        }

        for (Phone i : phones) {
            System.out.println(i.getModel());
            System.out.println(i.getNumber());
            System.out.println(i.getWeight());
            System.out.println();
        }
    }
}