package Customers;

public class Basic extends Customer{
    private final int returnDays = 5;
    public Basic(String name, String contactNum) {
        super(name, contactNum);
    }
@Override
    public int getReturnDays() {
        return returnDays;
    }
}
