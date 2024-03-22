import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args)
    {
    LocalDate date  = LocalDate.of(2024,03,22);
    LocalDate date1 = date.plusYears(2);
    System.out.println(date1);
}
}