//WAP to find all the factor of number
public class p7 {
    public static void main(String[] args) {
        int n=54;
        for(int i=1;i<=n;i++)
        {
           if(n % i == 0){
            System.out.println(i);
        }
        }
    }
}


