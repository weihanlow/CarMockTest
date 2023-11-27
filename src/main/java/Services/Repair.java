package Services;

import Vehicles.*;
import Customers.*;

import java.time.LocalDate;

public abstract class Repair extends CarServiceCentre {

    public static void getReturnDate(Vehicle vehicle) {
        if (checkVehicle(vehicle) & vehicle.isOilChanged() & vehicle.isBrakesChecked()) {
            LocalDate currentDate = LocalDate.now();
            Customer selectedCustomer = vehicle.getOwner();
            int repairDays = selectedCustomer.getReturnDays();
            if (vehicle.getClass()==Truck.class) {
                repairDays += 1;
            } else if (vehicle.getClass()==Motorcycle.class) {
                repairDays -= 1;
            }
            LocalDate returnDate = currentDate.plusDays(repairDays);
            System.out.println("Dear " + selectedCustomer.getName() + ",");
            System.out.println("Your " + vehicle.getModel() + " " + vehicle.getYear() + " will be available for pickup on " + returnDate);
            System.out.println(" ");
        }
    }

    public static void oilChange(Vehicle vehicle) {
        if (checkVehicle(vehicle)) {
            if (!vehicle.isOilChanged()) {
                vehicle.changedOil();
            }
        }
    }

    public static void brakeCheck(Vehicle vehicle) {
        if (checkVehicle(vehicle)) {
            if (!vehicle.isBrakesChecked()) {
                vehicle.checkedBrakes();
            }
        }
    }
}