import java.util.*;
public class Minutes_to_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int min = sc.nextInt();
        int day = min / (60 * 24);
        int yr = day / 365;
        int ex = day - yr * 365;
        System.out.println(min + " is approx. " + yr + " years and " + ex + " days.");
    }
}
