public class StudentComp {
    public double compare(Object o1, Object o2) {
        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}