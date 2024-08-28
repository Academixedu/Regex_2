public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
        public static boolean validatePhoneNumber(String PhoneNumber){
            String regex = "\\d{3}[- ]?\\d{3}[- ]?\\d{4}";
            return PhoneNumber.matches(regex);
        }

    public static void main(String[] args) {
        String[] PhoneNumbers = {"123-456-7890", "123 456 7890", "1234567890",  "12-3456-7890", "123-45-67890"};
        for (String number : PhoneNumbers) {
            boolean isValid = validatePhoneNumber(number);
            System.out.println(number + ": " + (isValid ? "Valid" : "Invalid"));
        }
    }
}
