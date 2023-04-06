//WAP TO FIND THE LARGEST DIGIT IN THE NUMBER
public class P25 {
    public static void main(String[] args)
    {
        int n=43339;
        int max=Integer.MIN_VALUE;
        while(n!=0){
            int d =n%10;
            if(d>max){
                max=d;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}
