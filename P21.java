//WAP TO FIND IF GIVEN NUMBER IS NIVEN NUMBER OR NOT
public class P21 {
    public static void main(String[] args) {
        int n=18;
        int temp=n;
        int sum=0;

        while (n !=0) {
            int d = n % 10;

            sum = sum + d;

            n = n / 10;
        }
        if(temp % sum==0)
        {
            System.out.println("it is niven number");
        } else {
            System.out.println("it not niven number");
        }
    }
}


