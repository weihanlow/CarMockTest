package Vehicles;
import Customers.*;

import java.util.Objects;

public abstract class Vehicle {
    protected final String model;
    protected final int year;
    protected final Customer owner;
    protected boolean oilChanged;
    protected boolean brakesChecked;

    public Vehicle(String model, int year, Customer owner, boolean oilChanged, boolean brakesChecked) {
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.oilChanged = oilChanged;
        this.brakesChecked = brakesChecked;
    }

    public Customer getOwner() {
        return owner;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public boolean isOilChanged() {
        return oilChanged;
    }
    public boolean changedOil() {
        return oilChanged = true;
    }
    public boolean isBrakesChecked() {
        return brakesChecked;
    }
    public boolean checkedBrakes() {
        return brakesChecked = true;
    }
}
