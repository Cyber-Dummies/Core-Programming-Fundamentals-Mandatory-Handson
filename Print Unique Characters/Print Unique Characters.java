import java.util.Scanner;
public class UniqueChar
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k=0,l=0,m=0,d=0;
        System.out.println("Enter the Sentence : ");
        String st=sc.nextLine();
        st=st.replaceAll("\\s","");
        char a[]=st.toCharArray();
        char b[]=new char[100];
        b[0]='0';
        i=a.length;
        for(int q=0;q<i;q++)
        {
            if(Character.isDigit(a[q]))
            {
                d++;
            }
        }
        if(d>0)
        {
            System.out.println("Invalid Sentence");
        }
        else
        {
            while(j<i)
            {
                int count=0;
                for(k=0;k<i;k++)
                {
                    if(a[j]==a[k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    l++;
                    b[l]=a[j];
                    j++;
                }
                else
                {
                    j++;
                }
            }
            if(l==0)
            {
                System.out.println("No unique characters");
            }
            else
            {
                System.out.println("Unique Characters:");
                for(m=1;m<=l;m++)
                {
                    System.out.println(b[m]);
                }
            }
        }
    }
}
