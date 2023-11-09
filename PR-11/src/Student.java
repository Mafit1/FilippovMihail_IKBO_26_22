public class Student {
    private int IDnumber;
    private double GPA;

    public Student(int IDnumber, double GPA) {
        this.IDnumber = IDnumber;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDnumber=  " + IDnumber +
                ", GPA=  " + GPA +
                '}';
    }

    public int compareTo(Object object){
        return this.IDnumber - ((Student) object).IDnumber;
    }
}
