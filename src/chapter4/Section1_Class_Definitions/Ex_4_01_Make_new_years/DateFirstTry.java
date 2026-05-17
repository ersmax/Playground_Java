package chapter4.Section1_Class_Definitions.Ex_4_01_Make_new_years;

public class DateFirstTry {
    public String month;
    public int day;
    public int year;

    public void writeOutput() {
        System.out.println(month + " " + day + ", " + year);
    }

    public void makeItNewYears() {
        month = "January";
        day = 1;
    }
}
