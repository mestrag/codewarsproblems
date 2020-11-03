public class StringCase {
    public static void main(String[] args) {
        System.out.println(solve("testT"));
    }
    public static String solve(final String str) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        char[] character = str.toCharArray();
        for (int i = 0; i < character.length; i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                lowerCaseCount++;
           } else if (Character.isUpperCase(str.charAt(i))) {
                upperCaseCount++;
            }
        }
        if (upperCaseCount > lowerCaseCount) {
            return str.toUpperCase();
        } else if (lowerCaseCount > upperCaseCount) {
            return str.toLowerCase();
        } else if (lowerCaseCount == upperCaseCount) {
            return str.toLowerCase();
        }
        return "";
    }
}
