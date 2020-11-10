/*
Write a function that takes in a binary string and returns the equivalent decoded text (the text is ASCII encoded).
Each 8 bits on the binary string represent 1 character on the ASCII table.
The input string will always be a valid binary string.
Characters can be in the range from "00000000" to "11111111" (inclusive)
Note: In the case of an empty binary string your function should return an empty string.
 */

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BinarytoText {

    public static String binaryToText(String binary) {
        StringBuilder sb = new StringBuilder();
        if (binary != "") {
            Arrays.stream(binary.split("(?<=\\G.{8})")).forEach(s -> sb.append((char) Integer.parseInt(s, 2)));
        } else {
            return "";
        }
        return sb.toString();
    }
}
