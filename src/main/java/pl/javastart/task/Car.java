package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConditioning) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public double getAverageFuelConsumption() {
        if (isAirConditioning()) {
            return super.getAverageFuelConsumption() + 0.8;
        }
        return super.getAverageFuelConsumption();
    }
}