// import java.time.LocalDate;

// public class Task5 {
//     public static void main(String[] args) {
//         if (args.length != 4) {
//             System.out.println("Usage: java DateCalculator <year> <month> <day> <yearsToAdd> <monthsToAdd> <daysToAdd>");
//             return;
//         }
//         int year = Integer.parseInt(args[0]);
//         int month = Integer.parseInt(args[1]);
//         int day = Integer.parseInt(args[2]);
//         int yearsToAdd = Integer.parseInt(args[3]);
//         int monthsToAdd = Integer.parseInt(args[4]);
//         int daysToAdd = Integer.parseInt(args[5]);
//         LocalDate date = LocalDate.of(year, month, day);
//         LocalDate updatedDate = date.plusYears(yearsToAdd).plusMonths(monthsToAdd).plusDays(daysToAdd);
//         System.out.println("Updated date: " + updatedDate);
//     }
// }
