package task2;

public class MVCPatterDemo2 {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDataBase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Ivan");
        controller.setEmployeeSalary(13.5);

        System.out.println("\nAfter updating:");

        controller.updateView();
    }

    public static Employee retriveEmployeeFromDataBase() {
        Employee e = new Employee();
        e.setName("Oleg");
        e.setSalary(100000);
        return e;
    }
}
