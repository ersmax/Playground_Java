/*
Convert the following expression to an equivalent fully parenthesized expression:
bonus + day * rate / correctionFactor * newGuy – penalty
 */

package chapter3.Section2_Boolean_Expressions;

public class Ex_3_21_Parenthesized_expression {
    public static void main(String[] args) {
        int bonus = 1, day = 2, rate = 3, correctionFactor = 4, newGuy = 5, penalty = 6;
        int expression = ((bonus + (((day * rate) / correctionFactor) * newGuy)) - penalty);
    }
}
