import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse(date1, formatter);
        LocalDate d2 = LocalDate.parse(date2, formatter);
        long difference = Math.abs(ChronoUnit.DAYS.between(d1, d2));
        
        return (int) difference;
    }
}