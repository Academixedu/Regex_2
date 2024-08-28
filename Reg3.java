import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void main(String args[]){
    String pattern="^[^abc]";
    String text="dbc";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(text);
    if(m.find()){
    System.out.println("valid");


}else{
    System.out.println("invalid");
}
}
}
