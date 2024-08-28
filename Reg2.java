import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void regex(String str){
    String pattern="^\\d.*";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(str);

    
    if(m.matches()){
        System.out.println("matches :"+str);
    }
    else{
        System.out.println("not match:"+str);
    }
}


public static void main(String[] args) {
    regex("123abc");
    regex("4you");
    regex("abc123");
    regex("you4");
}
}
