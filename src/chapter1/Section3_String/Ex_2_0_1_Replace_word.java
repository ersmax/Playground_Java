/*
change the sentence from "I despise text processing"
to something similar to "I like text processing"
 */

package chapter1.Section3_String;

public class Ex_2_0_1_Replace_word {
    public static void main(String[] args) {
        // Precondition: the variable "despise" is in the sentence
        // Postcondition: the variable "despise" is replaced by "like"
        // without using replace() method

        String variable = "despise";
        String sentence = "I " + variable + " text processing";
        int startSubstring = sentence.indexOf(variable);
        String endSubstring =
                sentence.substring(startSubstring + variable.length());

        System.out.println(sentence);
        System.out.println("The word \""
                        + variable
                        + "\" starts at index "
                        + startSubstring);

        variable = "like";
        sentence = sentence.substring(0, startSubstring) + variable + endSubstring;

        System.out.println("The changed string is:");
        System.out.println(sentence);
    }
}
