package task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Alexander");
        controller.setStudentRollNo("123");

        System.out.println("\nAfter updating:");

        controller.updateView();
    }

    public static Student retriveStudentFromDataBase() {
        Student st = new Student();
        st.setName("Mihail");
        st.setRollNo("321");
        return st;
    }
}
