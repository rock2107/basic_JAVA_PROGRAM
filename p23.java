//WAP TO FIND ALL STRONG NUMBER IN BETWEEN 1-1000
public class p23 {
    public static void main(String[] args) {

        for (int n = 1; n <= 1000; n++) {
            int sum = 0;
            int temp = n;
            while (n != 0) {
                int d = n % 10;
                int fact = 1;
                for (int i = 1; i <= d; i++) {
                    fact = fact * i;
                }
                sum = sum + fact;
                n=n/10;
            }
            if (temp == sum) {
                System.out.println(sum);
            }
            n=temp;
        }

    }}
