import java.util.*;

public class JavaOperator {
    public static void main(String args[]){
        int A = 5;
        int B = 10;
        // int c = A + B;
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        System.out.println(A++);
        System.out.println(A);
        System.out.println(B--);
        System.out.println((A==B));
        System.out.println((A!=B));
        System.out.println((A>=B));
        System.out.println((A<=B));
        System.out.println((A<B));
        System.out.println((A>B));

        System.out.println("Logical AND : " + ((3 > 2) && (2 < 1)));
        System.out.println("Logical OR : " + ((3 > 2) || (2 < 1)));
        System.out.println("Logical NOT : " + !true);

        int x = 9, y= 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a))/(a + b*y);
        System.out.println(exp);
    }
}