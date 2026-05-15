package chapter4.Section1_Class_Definitions.Ex_4_0_5_Date_equals_precedes;

public class DateFourthTryDemo {

    public static void main(String[] args) {
        DateFourthTry date = new DateFourthTry();
        date.setDate(6, 30, 2026);
        date.writeOutput();

        DateFourthTry date2 = new DateFourthTry();
        date2.setDate(6, 29, 2026);
        date2.writeOutput();

        boolean isEqual = date.equals(date2);
        boolean isLess = date.precedes(date2);
        if (isEqual)
            System.out.println(date.toString() + " is equal to " + date2.toString());
        else if (isLess)
            System.out.println(date.toString() + " precedes " + date2.toString());
        else
            System.out.println(date.toString() + " follows " + date2.toString());
    }
}
