import java.time.LocalTime;
import java.time.ZoneId;

public class Time1 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        
        LocalTime currentTimeInNY = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York: " + currentTimeInNY);
        
        LocalTime customTime = LocalTime.of(12, 30);
        System.out.println("Custom time: " + customTime);
        
        LocalTime customTimeWithSeconds = LocalTime.of(15, 45, 30);
        System.out.println("Custom time with seconds: " + customTimeWithSeconds);
        
        LocalTime parsedTime = LocalTime.parse("10:15:30");
        System.out.println("Parsed time: " + parsedTime);
    }
}