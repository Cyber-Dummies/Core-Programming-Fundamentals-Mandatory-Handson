import java.util.*;
public class Course
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of course:");
        int sub=sc.nextInt();
        
        if(sub>0){
            
            System.out.println("Enter course names:");
            String[] cn=new String[sub];
            for(int i=0;i<sub;i++)
            {
               cn[i]=sc.next();
            }
        System.out.println("Enter the course to be searched:");
        String key=sc.next();
        int flag=0;
        for(int i=0;i<sub;i++)
        {
            if(key.equals(cn[i]))
            {
                flag++;
            }
        }
        if(flag!=0)
        {
            System.out.println(key+" course is available");
        }
        else
        {
            System.out.println(key+" course is not available");
        }
        }
        else{
            System.out.println("Invalid Range");
        }
    }
        
}
