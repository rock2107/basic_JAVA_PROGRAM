
//WAP  WHICH accept N value and print the number of such points (x,y)possible which satisfy the above conditions?
//F(x,y)=x*2+5xy+3y*2
//x&y must be co-prime
//on substituting x & y in equation resultant value must be less than N
//result of equation after substiuting x & y values  must be perfect squre.
import java.util.Scanner;


public class p52 {

    public static void main(String[] args) {
        System.out.println(("Enter the value of N:"));

        Scanner sc=new Scanner(System.in);

        int  N= sc.nextInt(); ;
        int count = 0;
        //  variable to count the number of pairs of coprime integers
        for (int x = 1; (x < N); x++) {
            for (int y = 1; (y < N); y++) {
                //  check if x and y are coprime
                if (p52.IsCoprime(x, y)) {
                    int result = ((x * x)
                            + ((5
                            * (x * y)) + (3
                            * (y * y))));
                    //  check if the result is a perfect square
                    if (p52.IsPerfectSquare(result)) {
                        count++;
                    }

                }

            }

        }

        System.out.println(("Number of pairs of coprime integers: " + count));
    }

    //  function to check if two integers are coprime
    static boolean IsCoprime(int a, int b) {
        //  if either a or b is 1, they are coprime
        if (((a == 1)
                || (b == 1))) {
            return true;
        }

        //  find the greatest common divisor of a and b
        while ((b != 0)) {
            int temp = b;
            b = (a % b);
            a = temp;
        }

        //  if the gcd is 1, a and b are coprime
        return (a == 1);
    }

    //  function to check if an integer is a perfect square
    static boolean IsPerfectSquare(int n) {
        //  find the square root of n
        int sqrt = ((int)(Math.sqrt(n)));
        //  return true if the square root is an integer, false otherwise
        return sqrt * sqrt == n;
    }
}
