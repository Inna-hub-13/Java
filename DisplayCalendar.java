import java.util.*;

public class DisplayCalendar {

    private final static String[] months = {"January", "February", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    // months are zero based -> January - 0, February - 1 ...
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        displayCalendar(year);

    }

    private static boolean isValidMonth(int month) {

        return month > -1 && month < 12;
    }

    public static void printHeading(int month, int year) {

        if(!isValidMonth(month))
            return;

        System.out.printf("\n\n\t\t\t   %s %d\n", months[month], year);
        System.out.println("\t----------------------------------");
        System.out.printf("\t%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n",
                "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    }

    private static boolean isLeapYear(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static int getNumberOfDaysInMonth(int month, int year) {

        if(!isValidMonth(month))
            return -1;

        if(month == 0 || month == 2 || month == 4 ||
                month == 6 || month == 7 || month == 9 || month == 11)
            return 31;

        else if(month == 1){

            if(isLeapYear(year))
                return 29;
            else
                return 28;
        }

        else
            return 30;
    }

    public static void printDates(int month, int year) {

        int numberOfDays = getNumberOfDaysInMonth(month, year);
        // Invalid month input
        if(numberOfDays == -1)
            return;

        GregorianCalendar calendar = new GregorianCalendar(year, month, 1);

        // 1 - Sun, 2 - Mon ...
        int firstDayOfTheMonth = calendar.get(Calendar.DAY_OF_WEEK);
        int countCharsPerLine = 0;

        // <firstDayOfTheMonth> is placed under the determined day of the week
        System.out.print("\t");
        while(firstDayOfTheMonth > 1) {
            System.out.printf("%5s", " ");
            countCharsPerLine++;
            firstDayOfTheMonth--;
        }

        for(int i = 1; i <= numberOfDays; i++){

            System.out.printf("%3d  ", i);
            countCharsPerLine++;

            if(countCharsPerLine == 7){

                System.out.println();
                System.out.print("\t");
                countCharsPerLine = 0;
            }
        }
    }

    public static void displayCalendar(int year) {

        for(int i = 0; i < 12; i++){
            printHeading(i, year);
            printDates(i, year);
        }
        System.out.println();
    }
}
