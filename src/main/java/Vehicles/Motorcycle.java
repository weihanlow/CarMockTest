package Vehicles;

import Customers.Customer;

public class Motorcycle extends Vehicle{
    public Motorcycle(String model, int year, Customer owner, boolean oilChanged, boolean brakesChecked) {
        super(model, year, owner, oilChanged, brakesChecked);
    }
}
