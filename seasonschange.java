//Create a season method that passes two integers (month,day) as the parameter. 
//The conditional are based on the seasons of the year and what randon number is entered by the user as a input.
//The ranges of dates to season are the following  12/16 and 3/15, Winter,3/16 and 6/15 Sping, 9/16 and 12/15 Fall.
package season; 
import java.util.*;

public class seasonschange{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the month number: ");
        int month = input.nextInt();
        System.out.print("Please enter the day number: ");
        int day   = input.nextInt();
        System.out.println(season(month,day));
    }
    
    public static String season(int month, int day){
        if (month <= 2 || (month == 3 && day <= 15) || (month == 12 && day > 15 )){
            return "Winter";
        } else if (month <= 5 || (month == 6 && day <= 15)){
            return "Spring";
        } else if (month <= 8 || (month == 9 && day <= 15)){
            return "Summer";
        } else {
            return "Fall";
        }
    }
}