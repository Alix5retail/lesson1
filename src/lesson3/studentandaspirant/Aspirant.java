package lesson3.studentandaspirant;

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String fistName, String lastName, String group, double averageMark, String scientificWork) {
        super(fistName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
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
