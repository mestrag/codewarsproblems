import java.util.Arrays;

/*Write a function that accepts an array of 10 integers (between 0 and 9),
that returns a string of those numbers in the form of a phone number.
 */
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        // Your code here!
        return "(" + sb.substring(0, 3) + ")" + " " + sb.substring(3, 6) + "-" + sb.substring(6, sb.length());
    }
}
