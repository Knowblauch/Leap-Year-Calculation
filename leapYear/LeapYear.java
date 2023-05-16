package leapYear;

public class LeapYear{

    public boolean calculation(int year){
        boolean isLeapYear = false;

        if(year%4 == 0){
            isLeapYear = true;

            if(year%100 == 0){
                isLeapYear = false;

                if(year%400 == 0){
                    isLeapYear = true;
                }
            }
        }
        return isLeapYear;
    }
}