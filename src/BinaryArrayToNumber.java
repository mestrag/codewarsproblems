import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static void main(String[] args) {
        ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1)));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < binary.size(); i++) {
            bf.append(binary.get(i));
        }
        return Integer.parseInt(bf.toString(), 2);
    }
}
