import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Shape[] arr=new Shape[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            String type=s.next();
            if(type.equals("Triangle"))
            {
                Triangle obj=new Triangle();
                obj.setHeight(s.nextDouble());
                obj.setBase(s.nextDouble());
                arr[i]=obj;
            }
            else if(type.equals("Sphere"))
            {
                Sphere obj2=new Sphere();
                obj2.setRadius(s.nextDouble());
                arr[i]=obj2;
            }
            else if(type.equals("Rectangle"))
            {
                Rectangle obj3=new Rectangle();
                obj3.setLength(s.nextDouble());
                obj3.setWidth(s.nextDouble());
                arr[i]=obj3;
            }
            else if(type.equals("Cube"))
            {
                Cube obj4=new Cube();
                obj4.setHeight(s.nextDouble());
                obj4.setLength(s.nextDouble());
                obj4.setWidth(s.nextDouble());
                arr[i]=obj4;
            }
        }
        for(int i=0;i<5;i++)
        {
            double area=arr[i].area();
            double volume=arr[i].volume();
            System.out.println("Area "+area);
            if(volume!=-1)
            {
                System.out.println("Volume "+volume);
            }
        }
    }
}
    
