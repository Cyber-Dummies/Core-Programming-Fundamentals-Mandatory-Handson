import java.util.*;
public class StudentMain
{
    public static Student getStudentDetails()
    {
        Scanner sc=new Scanner(System.in);
        int id,sub;
        String name;
        System.out.println("Enter the id:");
        id=sc.nextInt();
        System.out.println("Enter the name:");
        name=sc.nextLine();
        sub=0;
        while(true)
        {   
            System.out.println("Enter the no of subjects:");
            sub=sc.nextInt();
            if(sub<=0)
            {
                System.out.println("Invalid number of subject");
            }
            else
            {
                break;    
            }
        }
        int[] marks=new int[sub];
        for(int i=0;i<sub;i++)
        {
            int m=0;
            while(true)
            {
                System.out.println("Enter mark for subject "+(i+1)+" : ");
                m=sc.nextInt();
                if(m<0 || m>100)
                {
                    System.out.println("Invalid Mark");
                }
                else
                {
                    break;    
                }
            }
            marks[i]=m;
        }
        Student s=new Student(id,name,marks);
        return s;
    }
    
    public static void main (String[] args) {
        Student s=getStudentDetails();
        s.calculateAvg();
        s.findGrade();
        
        System.out.println("Id:"  + s.getId());
        System.out.println("Name:" + s.getName());
        System.out.println("Average:" + s.getAverage());
        System.out.println("Grade:" + s.getGrade());
    }
}
