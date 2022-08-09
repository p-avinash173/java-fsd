package email;
import java.util.Scanner;

public class email_validation {
  public static void main(String[] args)
{

           String[] s= {"avinash@gmail.com","swetha@gmail.co.in","varsha@gmail.com","rahul@yahoo.com","vani@gmail.com","vignesh@yahoo.com",
        		   "krishna@gmail.com","Johnson@yahoo.com"};

           System.out.println("Enter your email Id");
           Scanner sc=new Scanner(System.in);
           String h=sc.next();
           boolean a=false;
           

           for(int i=0;i<s.length;i++) {
               if(h.equalsIgnoreCase(s[i])){

                    a=true;
               }
           }

           if(a==false) {
               System.out.println(h+"  Email ID is not present in Employee ID");
           }
           else {
               System.out.println(h+"  Email ID is present in Employee ID");
           }

}
}
