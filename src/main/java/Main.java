import Customers.*;
import Services.Repair;
import Vehicles.*;

public class Main {
    public static void main(String[] args) {

        Premium JD001 = new Premium("John Doe", "0124771018");
        Basic DW001 = new Basic("Doris Wilkins", "07365498669");
        Car toyotaYaris1 = new Car("Toyota Yaris", 2018, JD001,false, true );
        Motorcycle hondaTing1 = new Motorcycle("Honda Ting", 2016, JD001, false, false);
        Truck mercTruck1 = new Truck("Mercedes-Benz truck", 2014, DW001, true, false);

        JD001.dropOff(toyotaYaris1);
        JD001.dropOff(hondaTing1);
        DW001.dropOff(mercTruck1);

        Repair.oilChange(toyotaYaris1);
        Repair.oilChange(hondaTing1);
        Repair.brakeCheck(hondaTing1);
        Repair.brakeCheck(mercTruck1);

        Repair.getReturnDate(toyotaYaris1);
        Repair.getReturnDate(hondaTing1);
        Repair.getReturnDate(mercTruck1);

        JD001.pickUp(toyotaYaris1);
        JD001.pickUp(hondaTing1);
        DW001.pickUp(mercTruck1);
    }
}