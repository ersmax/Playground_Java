/*
Determine the value, true or false, of each of the following Boolean expressions,
assuming that the value of the variable count is 0 and the value of the variable
limit is 10. (Give your answer as one of the values true or false.)
a. (count == 0) && (limit < 20)
b. count == 0 && limit < 20
c. (limit > 20) || (count < 5)
d. !(count == 12)
e. (count == 1) && (x < y)
f. (count < 10) || (x < y)
g. !( ((count < 10) || (x < y)) && (count >= 0) )
h. ((limit/count) > 7) || (limit < 20)
i. (limit < 20) || ((limit/count) > 7)
j. ((limit/count) > 7) && (limit < 0)
k. (limit < 0) && ((limit/count) > 7)
 */

/*
a.  true
b.  true
c.  true
d.  true
e.  false
f.  true
g.  false
h.  false -> actually error
i.  true
j.  false -> actually error
k.  false
 */

package chapter3.Section2_Boolean_Expressions;

public class Ex_3_19_Boolean_expressions {
    public static void main(String[] args) {
        int count = 0;
        int limit = 10;
        System.out.println(((limit/count) > 7) || (limit < 20));
    }

}
