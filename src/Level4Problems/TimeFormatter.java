package Level4Problems;
/* https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java*/

import java.util.LinkedList;
import java.util.Queue;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        // your code goes here
        if (seconds == 0) {
            return "now";
        }
        int oneMinute = 60;
        int oneHour = 60 * oneMinute;
        int oneDay = 24 * oneHour;
        int oneYear = 365 * oneDay;

        Queue<String> queue = new LinkedList<>();

        int year = seconds / oneYear;
        if (year == 1) queue.add(year + " year");
        else if (year > 1) queue.add(year + " years");
        seconds = seconds - year * oneYear;

        int day = seconds / oneDay;
        if (day == 1) queue.add(day + " day");
        else if (day > 1) queue.add(day + " days");
        seconds = seconds - day * oneDay;

        int hour = seconds / oneHour;
        if (hour == 1) queue.add(hour + " hour");
        else if (hour > 1) queue.add(hour + " hours");
        seconds = seconds - hour * oneHour;

        int minute = seconds / oneMinute;
        if (minute == 1) queue.add(minute + " minute");
        else if (minute > 1) queue.add(minute + " minutes");
        seconds = seconds - minute * oneMinute;

        if (seconds == 1) queue.add(seconds + " second");
        else if (seconds > 1) queue.add(seconds + " seconds");

        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            String tmp = queue.poll();
            stringBuilder.append(tmp);
            if (queue.size() > 1) {
                stringBuilder.append(", ");
            } else if (queue.size() == 1) {
                stringBuilder.append(" and ");
            }
        }
        return stringBuilder.toString();
    }
}
