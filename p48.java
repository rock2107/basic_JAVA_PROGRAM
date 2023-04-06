// WAP FIND MISSING NUMBER IN AN ARRAY
public class p48 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,8,9,};
        //we have to check duplicates
        //range
        //sorted or not sorted
        int sum1=0;
        for (int i=0;i<a.length;i++){
            sum1=sum1+a[i];

        }
        System.out.println("sum of all the element:"+sum1);
        int sum2=0;
        for(int i=0;i<=9;i++){
            sum2=sum2+i;
        }
        System.out.println("sum of all the element in range:"+sum2);
        System.out.println("Missing element:"+(sum2-sum1));
    }
}
