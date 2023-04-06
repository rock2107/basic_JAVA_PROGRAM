//WAP program to find leap year
public class p29 {
    public static void main(String[] args) {
        int n =2003;
        if(n%4==0){
            if(n % 100==0){
                if(n % 400==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
