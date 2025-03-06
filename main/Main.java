import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDateTime d04 = LocalDateTime.now();

        DateTimeFormatter formatin = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        

        
        Instant d05 = Instant.parse("2025-06-03T08:36:12Z");

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04.format(formatin));
        System.out.println(d05);
        sc.close();
    }
}