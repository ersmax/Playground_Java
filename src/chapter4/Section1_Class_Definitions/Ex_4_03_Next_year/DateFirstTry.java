package chapter4.Section1_Class_Definitions.Ex_4_03_Next_year;

public class DateFirstTry {
    public String month;
    public int day;
    public int year;

    public void writeOutput() {
        System.out.println(month + " " + day + ", " + year);
    }

    public void yellIfNewYear() {
        boolean newYear;
        newYear = month.equalsIgnoreCase("January") && day == 1;

        if (newYear)
            System.out.println("Hurrah!");
        else
            System.out.println("Not New Year's Day");
    }

    public int getNextYear() {
        return year + 1;
    }
}
