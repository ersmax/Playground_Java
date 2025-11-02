/*
What is the output produced by the following code?
char letter = 'B';
switch (letter)
{
case 'A':
case 'a':
System.out.println("Some kind of A.");
case 'B':
case 'b':
System.out.println("Some kind of B.");
break;
default:
System.out.println("Something else.");
break;
}

// answer = Some kind of B.
 */

package chapter3.Section1_Branching;

public class Ex_3_9_Switch_Output {
    public static void main(String[] args) {
        char letter = 'B';
        switch (letter)
        {
            case 'A':
            case 'a':
                System.out.println("Some kind of A.");
            case 'B':
            case 'b':
                System.out.println("Some kind of B.");
                break;
            default:
                System.out.println("Something else.");
                break;
        }
    }
}
