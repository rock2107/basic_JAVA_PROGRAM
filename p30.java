//WAP to print all the element of an array
public class p30 {
    public static void main(String[] args) {
       int [] a={1,2,3,4,5,6};
        System.out.println("=======for loop==========");
        for( int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("==============while loop================");
        int j=0;
        while (j< a.length){
            System.out.println(a[j]);
            j++;
        }
    }
}
