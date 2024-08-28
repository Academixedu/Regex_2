import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void digitValidation(String s){
    String pattern="^[0-9]";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(s);

    if(m.find()){
        System.out.println("Matches: "+s);
    }
    else{
        System.out.println("Does Not Match: "+s);
    }

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    digitValidation(input);
    sc.close();
}
}
