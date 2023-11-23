package Task3;

public class CarController {

    private Car car;
    private CarView view;

    public CarController(Car car, CarView view) {
        this.car = car;
        this.view = view;
    }

    public void setCarModel(String model) {
        car.setModel(model);
    }

    public String getCarModel() {
        return car.getModel();
    }

    public void setCarNumber(String number) {
        car.setNumber(number);
    }

    public String getCarNumber() {
        return car.getNumber();
    }

    public void updateView() {
        view.printCarDetails(car.getModel(), car.getNumber());
    }
}
