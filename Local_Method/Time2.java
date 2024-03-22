import java.time.LocalTime;

public class Time2 
{
    public static int getHour(LocalTime time) {
        return time.getHour();
    }

    public static int getMinute(LocalTime time) {
        return time.getMinute();
    }

    public static int getSecond(LocalTime time) {
        return time.getSecond();
    }

    public static int getNano(LocalTime time) {
        return time.getNano();
    }

    public static boolean isAfter(LocalTime time1, LocalTime time2) {
        return time1.isAfter(time2);
    }
}