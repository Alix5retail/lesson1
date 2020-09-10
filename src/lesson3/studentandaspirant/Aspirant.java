package lesson3.studentandaspirant;

public class Aspirant extends Student {

    public Aspirant(String fistName, String lastName, String group, double averageMark) {
        super(fistName, lastName, group, averageMark);
    }

    @Override
    public double getScholarship() {
        int sum;
        if (getAverageMark() == 5) {
            sum = 200;
        } else {
            sum = 180;
        }
        return sum;
    }
}
