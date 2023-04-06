//wap to perfrom deletion order in array
import java.util.Arrays;

public class p37 {
    public static void main(String[] args) {
        int [] a={1,2,3,45};
        int index=2;
        System.out.println(Arrays.toString(a));
        a=delete(index, a);
        System.out.println(Arrays.toString(a));
        index=55;
        a=delete(index, a);
        System.out.println(Arrays.toString(a));

    }

    public static int[] delete(int index, int[]a) {
        if(index<0|| index>=a.length){
            System.out.println("index not found");
            return a;
        }
        int[] b=new int[a.length-1];
        for (int i=0;i<b.length;i++){
            if (i<index){
                b[i]=a[i];
            }
            else{
                b[i] =a[i+1];
            }
        }
        return b;
    }
}
