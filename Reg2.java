import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void regularexp(String str){
    String pattern="^\\d.*";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(str);
    if(m.matches()){
        System.out.println("match: "+str);
    }
    else{
        System.out.println(" not match: "+str);
    }
}
public static void main(String[] args) {
    regularexp("123abc");
    regularexp("4you");
    regularexp("abc123");
    regularexp("you4");
}
}