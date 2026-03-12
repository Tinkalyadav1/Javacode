import java.time.Year;

public class Leap {
    public static void main(String[] args) {
        int year = 2024;
        if (Year.of(year).isLeap()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}