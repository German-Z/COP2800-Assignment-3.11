import java.util.*;

public class DayDeterminer {
    public static void main(String[] args) {
        //Instantiate scanner input class
        Scanner input = new Scanner(System.in);
        //Prompt user to enter month
        System.out.print("Enter a month: ");
        int months = input.nextInt();
        //Prompt user to enter year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        // switch statement for number of day in each month from input
        switch (months) {
            case 1: System.out.println("January " + year + " had 31 days.");
            break;

            case 2: if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        System.out.println("Febuary " + year + " had 29 days.");
                    else 
                        System.out.println("Febuary " + year + " had 28 days.");
            break;

            case 3: System.out.println("March " + year + " had 31 days.");
            break;

            case 4: System.out.println("April " + year + " had 30 days.");
            break;

            case 5: System.out.println("May " + year + " had 31 days.");
            break;

            case 6: System.out.println("June " + year + " had 30 days.");
            break;

            case 7:System.out.println("July " + year + " had 31 days.");
            break;

            case 8:System.out.println("August " + year + " had 31 days.");
            break;

            case 9:System.out.println("September " + year + " had 30 days.");
            break;

            case 10:System.out.println("October " + year + " had 31 days.");
            break;

            case 11:System.out.println("November " + year + " had 30 days.");
            break;

            case 12: System.out.println("December " + year + " had 31 days.");
            break;
        }
    }
}
