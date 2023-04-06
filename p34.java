//wap to perfrom insersion order in array at end of array
import java.util.Arrays;

public class p34 {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        System.out.println(Arrays.toString(a));
        a=add(5,a);
        System.out.println(Arrays.toString(a));
        a=add(4588,a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] add(int element,int[] a){
        int[] b= new int[a.length + 1];

        for(int i=0;i<a.length;i++)
        {

            b[i]=a[i];
        }
        b[b.length-1]=element;
        return b;
    }
}
