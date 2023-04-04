package pl.javastart.task;

public class VehicleInfo {
    private String name;
    private Vehicle[] vehicles = new Vehicle[3];

    public VehicleInfo(String name, Vehicle vehicles1, Vehicle vehicles2, Vehicle vehicles3) {
        this.name = name;
        vehicles[0] = vehicles1;
        vehicles[1] = vehicles2;
        vehicles[2] = vehicles3;
    }
}
