package Task3;

public class MVCPatternDemo3 {
    public static void main(String[] args) {
        Car car = retriveCarFromDataBase();
        CarView view = new CarView();
        CarController controller = new CarController(car, view);

        controller.updateView();

        controller.setCarModel("Audi");
        controller.setCarNumber("B567HT");

        System.out.println("\nAfter updating");

        controller.updateView();
    }

    public static Car retriveCarFromDataBase() {
        Car c = new Car();
        c.setNumber("A123BC");
        c.setModel("Mazda");
        return c;
    }
}
