import java.util.Scanner;
public class Season
{
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month:");
        i=sc.nextInt();
        if(i>=3 && i<=5)
        {
            System.out.println("Season:Spring");
        }
        else if(i>=6 && i<=8)
        {
            System.out.println("Season:Summer");
        }
        else if(i>=9 && i<=10)
        {
            System.out.println("Season:Autumn");
        }
        else if(i>=11 && i<=12 || i>=1 && i<=2)
        {
            System.out.println("Season:Winter");
        }
        else
        {
            System.out.println("Invalid Month");
        }
    }
}
