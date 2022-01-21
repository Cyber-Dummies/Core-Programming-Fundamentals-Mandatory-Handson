import java.util.*;

public class Main
{
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        Library lib=new Library();
        int choice;
        for(int i=0;i<=50;i++)
        {
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author ");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            //System.out.println("Choice is : "+choice);
            if(choice==1)
            {
                //System.out.println("Inside Choice 1");
                Book b=new Book();
                System.out.println("Enter the isbn no:");
                int isbn=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the book name:");
                //sc.nextLine();
                String bname=sc.nextLine();
                System.out.println("Enter the author name:");
                String author=sc.nextLine();
                b.setIsbnno(isbn);
                b.setBookName(bname);
                b.setAuthor(author);
                lib.addBook(b);
            }
            if(choice==2)
            {
                //System.out.println("Inside Choice 2");
                ArrayList<Book> books=lib.viewAllBooks();
                if(books.isEmpty())
                {
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator itr2=books.iterator();
                while(itr2.hasNext())
                {
                    Book b=(Book) itr2.next();
                    System.out.println("ISBN no: "+b.getIsbnno());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author: "+b.getAuthor());
                }
            }
            if(choice==3)
            {
                //System.out.println("Inside Choice 3");
                System.out.println("Enter the author name:");
                String author=sc.nextLine();
                ArrayList<Book> books=lib.viewBooksByAuthor(author);
                if(books.isEmpty())
                {
                    System.out.println("None of the book published by the author "+author);
                    //sc.nextLine();
                    continue;
                }
                Iterator itr3=books.iterator();
                while(itr3.hasNext())
                {
                    Book b=(Book) itr3.next();
                    System.out.println("ISBN no: "+b.getIsbnno());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author: "+b.getAuthor());
                }
            }
            if(choice==4)
            {
                //System.out.println("Inside Choice 4");
                System.out.println("Enter the Book Name");
                String bname=sc.nextLine();
                System.out.println("Count is: "+lib.countnoofbook(bname));
            }
            if(choice==5)
            {
                //System.out.println("Inside Choice 5");
                break;
            }
        }
    }
}
