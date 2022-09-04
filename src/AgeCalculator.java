import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Dob in format [dd/mm/yyyy] : ");
        String DateOfBirth = sc.nextLine();
        String[] arr = DateOfBirth.split("/");
        int dd = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        int yyyy = Integer.parseInt(arr[2]);
        var d1 = LocalDate.of(yyyy, mm, dd);
        var d2 = LocalDate.now();
        var p = Period.between(d1, d2);
        System.out.println("your age is : " + p.getYears() + " Years " + p.getMonths() + " months " + p.getDays() + " days");
    }
}