package leapYear;
import java.util.*;

public class LeapYearTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");

        int inputYear = input.nextInt();
        input.close();

        String conclusion = " is not a leap year!";
        LeapYear yearToCheck = new LeapYear();
        
        yearToCheck.calculation(inputYear);

        if(yearToCheck.calculation(inputYear) == true){
            conclusion = "is a leap year!";
        }else{
            conclusion = "is not a leap year!";
        }

        System.out.println(inputYear + " " + conclusion);
        
    }
}