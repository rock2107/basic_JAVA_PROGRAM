//wap to perfrom insersion order in array at strt of array
//wap to perfrom insersion order in array at end of array
import java.util.Arrays;

public class p35 {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        System.out.println(Arrays.toString(a));
        a=add(4,18,a);
        System.out.println(Arrays.toString(a));
        a=add(0,18,a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] add(int index,int element,int[] a) {
        if (index < 0 || index > a.length) {
            System.out.println("index length not found");
            return a;
        }
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            if (i < index) {
                b[i]=a[i];

            }
            else {
                b[i+1]=a[i];

            }
        }
        b[index]=element;
        return b;
    }
}
