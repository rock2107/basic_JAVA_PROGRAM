import java.util.Scanner;

//WAP TO CHECK IF THE NUMBER IS A PRIME NUMBER
public class p12 {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER TE NUMBER");
        int n =sc.nextInt();
        int count=0;

        for(int i = 1;i <= n; i++)
        {
            if (n % i == 0) {
                count++;
            }
        }
                if(count==2){
                    System.out.println("number is prime ");
                }
                else
                {
                    System.out.println("number is not prime");
            }


    }
}
