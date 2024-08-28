import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void character(String chara){
    String pattern="^[^abc].*";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(chara);

     
    if(m.matches()){
        System.out.println("matches :"+chara);
    }
    else{
        System.out.println("not match:"+chara);
    }
}



    public static void main(String[] args) {
        character("def");
        character("xyz");
         character("123abc");
        character("apple");
       character( "bat");
       character("cat");

    }
}
