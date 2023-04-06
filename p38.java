//WAP TO PRINT TOTAL DECREMENT OPERATIONS PERFORMED TO MAKE
//THE ELEMENT OF THE ARRAY DIVISIBLE BY AN INTEGER
public class p38 {
    public static void main(String[] args) {
        int k=6;
        int []a ={5,9,12,16,25};
        int sum=0;
        for (int i=0;i<a.length;i++) {
            sum=sum+(a[i]%k);
        }
        System.out.println(sum);
    }
}
