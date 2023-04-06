//WAP TO FIND GIVREN NUMBER IS STRONG NUMBER OR NOT
public class p22 {
    public static void main(String[] args) {
        int n =370;
        int temp=n;
        int sum=0;
        while(n !=0){
            int d =n%10;
            int fact =1;
            for(int i =1;i<=d;i++){
                fact= fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("the number is strong number");
        }
        else{
            System.out.println("the number is not strong number");
        }
    }
}
