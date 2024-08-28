public class Reg21{
    public static void main(String[] args) {
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.

String regex="^\\d{3}[-]?\\d{3}[-]?\\d{4}$";
System.out.println("9849291013".matches(regex));
System.out.println("984-929-1013".matches(regex));
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
System.out.println("98-4929-1013".matches(regex));
}
}
