/*
Suppose we redefine the method setDate in Display 4.4 to the following:
public void setDate(int newMonth, int newDay,int newYear) {
    month = monthString(newMonth);
    day = newDay;
    year = newYear;
    System.out.println("Date changed to " + newMonth + " " + newDay + ", " + newYear);
}

Indicate all instances of newMonth that have their value changed to 6 in the
following invocation (also from Display 4.4):
date.setDate(6, 17, year);
 */

/*
The instances change in the function signature (int newMonth becomes int 6
Then monthsString(6)
Then "Date changed to " + 6

newMonth is a local variable to setDate. Hence, all newMonth instances change value to 6.
 */

package chapter4.Section1_Class_Definitions.Ex_4_07_Pass_by_value;

public class Ex_4_07_Pass_by_value {
}
