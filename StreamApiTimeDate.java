import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class StreamApiTimeDate {
   public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(Instant.now());
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Zone Id to get Date and Time od that :");
    String s = sc.nextLine();
    System.out.println(LocalDateTime.now(ZoneId.of(s)));    
   } 
}
