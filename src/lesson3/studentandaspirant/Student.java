package lesson3.studentandaspirant;

public class Student {

    private String fistName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String fistName, String lastName, String group, double averageMark) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double getScholarship() {
        int sum;
        if (getAverageMark() == 5) {
            sum = 100;
        } else {
            sum = 80;
        }
        return sum;
    }
}
