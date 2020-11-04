public class CountIPAddress {
    public static int ipsBetween(String s, String s1) {
        System.out.println(ipcalc(s));
        System.out.println(ipcalc(s1));
        return Math.abs(ipcalc(s) - ipcalc(s1));

    }

    public static int ipcalc(String s) {
        String[] x = s.split("\\.");

        int result;
        return (result =
                (int) (Integer.parseInt(x[0]) * 256 * 256 * 256
                        + Integer.parseInt(x[1]) * 256 * 256
                        + Integer.parseInt(x[2]) * 256
                        + Integer.parseInt(x[3]) * 1));


    }


}
