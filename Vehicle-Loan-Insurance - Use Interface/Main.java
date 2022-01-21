import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("BR0988", "Apache", "2 wheeler", 80000);
        System.out.println(vehicle.issueLoan());
        System.out.println(vehicle.takeInsurance());
    }
}
