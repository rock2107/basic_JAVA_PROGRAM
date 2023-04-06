public class p26 {
    public static void main(String[] args) {
        int n=55886;
        int min=Integer.MAX_VALUE;
        while(n!=0){
            int d=n%10;
            if(d<min){
                min=d;
            }
            n=n/10;
        }
        System.out.println(min);
    }
}
