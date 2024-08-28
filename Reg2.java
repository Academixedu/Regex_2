import java.util.Scanner;
public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "[0-9][a-zA-Z0-9]+";
        if(str.matches(regex))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
