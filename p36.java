//wap to perfrom insersion order in array based on index of array
import java.util.Arrays;

public class p36
{
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int index=2;
        int element=16;

        a = update(index,element,a);
        System.out.println(Arrays.toString(a));
     index=1;
     element=300;
        a = update(index,element,a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] update(int index,int element,int[] a) {
        if(index <0 || index>=a.length){
            System.out.println("index is not found");
            return a;
        }
        a[index]=element;
        return a;
    }

}
