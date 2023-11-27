package Vehicles;

import Customers.Customer;

public class Car extends Vehicle{
    public Car(String model, int year, Customer owner, boolean oilChanged, boolean brakesChecked) {
        super(model, year, owner, oilChanged, brakesChecked);
    }
}
