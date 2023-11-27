package Customers;

import Vehicles.*;
import Services.*;

import java.util.Objects;

public abstract class Customer {
    private final String name;
    private final String contactNum;

    public Customer(String name, String contactNum) {
        this.name = name;
        this.contactNum = contactNum;
    }

    public String getName() {
        return name;
    }
    public String getContactNum() {
        return contactNum;
    }

    public abstract int getReturnDays();

    public void dropOff(Vehicle vehicle) {
         CarServiceCentre.addVehicle(vehicle);
         System.out.println("Thank you " + name + " for choosing us!");
         System.out.println("We will contact you via your contact number " + contactNum + " when your " + vehicle.getModel() + " " + vehicle.getYear() + " is repaired.");
         System.out.println(" ");
    }

    public void pickUp(Vehicle vehicle) {
        if (name.equals(vehicle.getOwner().getName())) {
            CarServiceCentre.removeVehicle(vehicle);
            System.out.println("Thank you " + name + "! We hope you enjoyed our services.");
            System.out.println(" ");
        }
    }
}
