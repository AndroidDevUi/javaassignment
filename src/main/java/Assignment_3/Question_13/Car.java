package Assignment_3.Question_13;

public class Car implements FourWheeler {
    private String carName;

    Car(String carName) {
        this.carName = carName;
    }

    @Override
    public void fuelType(String fuel) {
        System.out.println(carName + " need " + fuel);
    }

    @Override
    public void start() {
        System.out.println(carName + " is Start");
    }

    @Override
    public void stop() {
        System.out.println(carName + " is Stop");
    }
}
