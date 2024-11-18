package Assignment_3.Question_13;

public interface FourWheeler extends Vehicle{
    @Override
    void stop();

    @Override
    void start();

    void fuelType(String fuel);
}
