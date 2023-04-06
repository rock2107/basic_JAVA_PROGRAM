public class p62 {
    public static void main(String[] args) {
        int n=9454;
        int max=Integer.MAX_VALUE;
        while(n!=0){
            int d=n%10;
            if(d<max){
                max=d;
            }
           n=n/10;
        }
        System.out.println(max);


    }
}
