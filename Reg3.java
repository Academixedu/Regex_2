import java.util.Scanner;
public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "[^abc]+";
        if(str.matches(regex))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
