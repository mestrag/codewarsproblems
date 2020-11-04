import java.util.regex.Pattern;

public class RegexValidatePinCode {
    public static void main(String[] args) {
        System.out.println(validatePin("\"\n123"));
        System.out.println("123\n");
        System.out.println("9¾9¾".length());
    }

    public static Boolean validatePin(String pin) {

        if (pin.length() <= 0 || pin.length() <= 3 || pin.length() == 5 || pin.length() > 6) {
            return false;
        }
        if (Pattern.compile("[!@#$%&*()_+=|<>?{}:/\n\"\\[\\]~-]").matcher(pin).find()) {
            return false;
        }

        if (pin.length() == 6 || pin.length() == 4) {
            if (Pattern.compile("[0-9]*\\.?[0-9]*[.a-z.A-Z]").matcher(pin).find()) {
                return false;
            }
            if (Pattern.compile("/(?:[1-9][0-9]*|0)\\/[1-9][0-9]^/g").matcher(pin).find()) {
                return false;
            }

            return true;
        }

        return true;
    }
}
