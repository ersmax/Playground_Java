package chapter4.Section1_Class_Definitions.Ex_4_0_1_Dates;

public class DateFirstTryDemo {

    public static void main(String[] args) {
        DateFirstTry date1;
        date1 = new DateFirstTry();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2026;
        System.out.println("date1:");
        date1.writeOutput();
        System.out.println(date1.month + " " + date1.day + ", " + date1.year);  // trace variables

        DateFirstTry date2;
        date2 = new DateFirstTry();
        date2.month = "July";
        date2.day = 4;
        date2.year = 1900;
        System.out.println("date2:");
        date2.writeOutput();
    }
}
