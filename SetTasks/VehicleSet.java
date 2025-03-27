import java.util.*;

public class VehicleSet {
    public static void main(String[] args) {
        Set<String> vehicles = new HashSet<>();

        vehicles.add("Car");
        vehicles.add("Bike");
        vehicles.add("Truck");
        vehicles.add("Bus");

        System.out.println("Available vehicles: " + vehicles);

        vehicles.remove("Truck");
        System.out.println("After removing 'Truck': " + vehicles);

        System.out.println("Is 'Car' available? " + vehicles.contains("Car"));

        System.out.println("Final list of vehicles: " + vehicles);
    }
}
