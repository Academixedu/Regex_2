public class Reg22{
    public static void main(String[] args) {
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
String exp="^\\d.*$";
// Example:
// Matches: "123abc", "4you"
System.out.println("123abc".matches(exp));
System.out.println("4you".matches(exp));
// Does Not Match: "abc123", "you4"
System.out.println("abc123".matches(exp));
System.out.println("you4".matches(exp));
}
}
