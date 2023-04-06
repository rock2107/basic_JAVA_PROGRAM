//WAP to find if the number is armstrong number
public class p27 {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0, count = countofDigits(n);
        while (n != 0) {
            int d=n%10;
            sum = sum + pow(d, count);
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("ArmStrong Number");
        } else {
            System.out.println("Not an ArmStrong Number");
        }


    }

    public static int pow(int n, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * n;
        }
        return res;
    }

    public static int countofDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;

    }
}
