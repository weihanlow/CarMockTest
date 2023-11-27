package Customers;

public class Premium extends Customer{
    private final int returnDays = 2;
    public Premium(String name, String contactNum) {
        super(name, contactNum);
    }

    @Override
    public int getReturnDays() {
        return returnDays;
    }
}

