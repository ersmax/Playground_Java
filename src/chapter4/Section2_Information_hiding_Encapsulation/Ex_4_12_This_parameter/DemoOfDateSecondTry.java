package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_12_This_parameter;

public class DemoOfDateSecondTry {

    public static void main(String[] args) {
        DateSecondTry date = new DateSecondTry();
        date.readInput();

        int dayNumber = date.getDay();
        System.out.println("That is the " + dayNumber + "th of the month");
        System.out.println(date.getMonth());
    }
}
