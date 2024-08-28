import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void except(String cha){
    String pattern="^[^abc].*";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(cha);
    if(m.matches()){
        System.out.println("match :"+cha);
    }
    else{
        System.out.println("not match: "+cha);
    }
}
public static void main(String[] args) {
    except("xyz");
    except("123abc");
    except("def");
    except("apple");
    except("bat");
    except("cat");
}
}
