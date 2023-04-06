//WAP TO FIND SUM OF ALL DIGITS OF NUMBER
public class p18 {
    public static void main(String[] args)
    {
        int n =344555624;
        int sum=0;
        while(n!=0){
            int d = n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
    }
}
