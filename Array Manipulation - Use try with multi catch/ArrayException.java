import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayException
{
    public String getPriceDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int r=sc.nextInt();
        System.out.println("Enter the price details");
        int arr[]=new int[r];
        try{
            for(int i=0;i<r;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int key=sc.nextInt();
            return ("The array element is " +arr[key]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return("Array index is out of range");
        }
        catch(InputMismatchException h)
        {
            return("Input was not in the correct format");
        }
    }
    public static void main (String[] args) {
        ArrayException a=new ArrayException();
        System.out.println(a.getPriceDetails());
    }
}
