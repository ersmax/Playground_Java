package chapter4.Section1_Class_Definitions.Ex_4_0_6_Date_Inside_Outside_views;

public class DateFifthTryDemo {

    public static void main(String[] args) {
        DateFifthTry date = new DateFifthTry();
        date.setDate(6, 29, 2026);
        System.out.println(date);

        DateFifthTry date2 = new DateFifthTry();
        date2.setDate(6, 30, 2026);
        System.out.println(date);

        boolean isEqual = date.equals(date2);
        boolean isLess = date.precedes(date2);
        if (isEqual)
            System.out.println(date + " is equal to " + date2);
        else if (isLess) {
            System.out.println(date + " precedes " + date2);
            String newString = date + " precedes " + date2 + ". Pretty cool";
            // plus operator causes the automatic invocation of toString()
            System.out.println(newString);
        }
        else
            System.out.println(date + " follows " + date2);
    }
}
