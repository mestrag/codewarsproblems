package Level4Problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        return Arrays.stream(text.split("\n")).map(s -> {
            for (String symbol : commentSymbols)
                s = s.replaceAll("(\\s+$)|(\\s*[" + symbol + "].*)", "");
            return s;
        }).collect(Collectors.joining("\n"));
    }
}
