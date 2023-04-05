package pl.javastart.task;

public class Truck extends Car {
    private double loadWeight;

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean airConditioning, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, airConditioning);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getAverageFuelConsumption() {
        if (isAirConditioning()) {
            return super.getAverageFuelConsumption() + 0.8;
        }
        return super.getAverageFuelConsumption();
    }
}
