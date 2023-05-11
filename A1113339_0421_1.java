import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1113339_0421_1 
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email address: ");
        String email = sc.nextLine();
        sc.close();

        String emailFormat = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailFormat);
        Matcher decider = pattern.matcher(email);
        
        if (decider.matches()) 
        {
            System.out.println("this is a valid email address.");
        } 
        
        else 
        {
            System.out.println("this is an invalid email address.");
        }
    }
}