/*
In the definition of precedes in Display 4.7, we used
month.equals(otherDate.month)
to test whether two months are equal; but we used
getMonth() < otherDate.getMonth()
to test whether one month comes before another. Why did we use month in
one case and getMonth in another case?
 */

/*
This is because getMonth() returns an integer, which allows to compare it with < operator.
In the definition of equals method, the value of month is simply a String that can be compared
with the String class methods.
 */

package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_13_Precedes;

public class Ex_4_13_Precedes {
}
