public class AbbreviateWords {

    public static void main(String[] args) {
        String x = "raghu mesta";
        String[] y = x.split(" ");
        String z = y[0].charAt(0) + "." + y[1].charAt(0);
        System.out.print(z.toUpperCase());

    }
}
