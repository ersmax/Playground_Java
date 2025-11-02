/*
What is the output produced by the following code?
int key = 1;
switch (key + 1)
{
case 1:
System.out.println("Apples");
break;
case 2:
System.out.println("Oranges");
break;
case 3:
System.out.println("Peaches");
case 4:
System.out.println("Plums");
break;
default:
System.out.println("Fruitless");
}

// Oranges
 */

package chapter3.Section1_Branching;

public class Ex_3_10_Switch_Output_2 {
    public static void main(String[] args) {
        int key = 1;
        switch (key + 1)
        {
            case 1:
                System.out.println("Apples");
                break;
            case 2:
                System.out.println("Oranges");
                break;
            case 3:
                System.out.println("Peaches");
            case 4:
                System.out.println("Plums");
                break;
            default:
                System.out.println("Fruitless");
        }
    }
}
