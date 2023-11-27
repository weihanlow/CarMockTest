package Vehicles;

import Customers.Customer;

public class Truck extends Vehicle{
    public Truck(String model, int year, Customer owner, boolean oilChanged, boolean brakesChecked) {
        super(model, year, owner, oilChanged, brakesChecked);
    }
}
