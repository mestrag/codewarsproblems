public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int sum = 0;
        for (int i = 0; i < games.length; i++) {
            if (games[i].charAt(0) > games[i].charAt(2)) {
                sum += 3;
            } else if (games[i].charAt(0) < games[i].charAt(2)) {
                sum += 0;
            } else if (games[i].charAt(0) == games[i].charAt(2)) {
                sum += 1;
            }
        }
        return sum;
    }
}
