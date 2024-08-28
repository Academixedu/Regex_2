public class Reg23{
    public static void main(String[] args) {   
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
String str="^[^abc].*"; 
// Example:
// Matches: "def", "xyz", "123abc"
String s="def";
if(s.matches(str)){
    System.out.println("Matches: "+s);
}
else{
    System.out.println("Does not Matches" +s);
}
//System.out.println("def".matches(str)+" "+"xyz".matches(str)+" "+"123abc".matches(str));

// Does Not Match: "apple", "bat", "cat"

String r="apple";
if(r.matches(str)){
    System.out.println("Matches: "+r);
}
else{
    System.out.println("Does not Matches: " +r);
}
//System.out.println("apple".matches(str)+" "+"bat".matches(str)+" "+"cat".matches(str));

}
}
