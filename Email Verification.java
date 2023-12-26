import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("company@domain.co.in");  
        emails.add("company@domain.com");  
        emails.add("company.name@domain.com");  
        emails.add("company#@domain.co.in");  
        emails.add("company@domain.com");  
        emails.add("company@domaincom");  
         
        emails.add("@yahoo.com");  
        emails.add("company#domain.com");  
       
        String regex = "^(.+)@(.+)$";  
         
        Pattern pattern = Pattern.compile(regex);  
        
        for(String email : emails){  
             
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  