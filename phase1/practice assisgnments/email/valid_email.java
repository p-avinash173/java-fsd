package email;
import java.util.regex.*;    
import java.util.*;    
public class valid_email{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("avinash@gmail.co.in");  
        emails.add("avinash^gmail.com");  
        emails.add("avinash@gmail.com");  
        emails.add("avinash@gmail.org");  
        emails.add("avinash/gmail.com");   
        emails.add("avinash#gmail.com");  
        // pattern for the email set up   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        Pattern pattern = Pattern.compile(regex);  
        //for email array list  
        for(String email : emails){  
            //set the instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches());  
        }  
    }  
}

