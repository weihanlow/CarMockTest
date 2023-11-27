package Services;

import Vehicles.*;

import java.util.ArrayList;

public class CarServiceCentre implements ServiceCentre{

    private static final ArrayList<Vehicle> Inventory = new ArrayList<>();

    public static void addVehicle(Vehicle vehicle) {
        Inventory.add(vehicle);
    }

    public static void removeVehicle(Vehicle vehicle) {
        Inventory.remove(vehicle);
    }

    public static boolean checkVehicle(Vehicle vehicle) {
        return Inventory.contains(vehicle);
    }

    public ArrayList getInventory() {
        return Inventory;
    }
}
