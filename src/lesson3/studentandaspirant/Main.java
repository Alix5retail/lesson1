package lesson3.studentandaspirant;

public class Main {
    public static void main(String[] args) {
        Student ali = new Student("Ali", "Alekperov", "1A", 5);
        Aspirant mike = new Aspirant("Mike", "Test", "1B", 5, "Разработка паттернов проектирования");
        Student student = new Aspirant("Steve", "Test2", "1C", 5, "Чистый код");
        Student[] arr = {ali, mike, student};

        for (Student i : arr) {
            System.out.println(i.getScholarship());
        }
    }
}