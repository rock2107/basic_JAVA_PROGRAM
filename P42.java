//WAP TO FIND SECOND LARGEST VALUE IN AN ARRAY
public class P42
 {
     public static void main(String[] args) {
         int[] a={488,30,-1,-5,652};
         int largest=Integer.MIN_VALUE;
         int SLARGEST =Integer.MIN_VALUE;
         {for( int i=0;i<a.length;i++){
             if(a[i]>largest){
                 SLARGEST=largest;
                 largest=a[i];
             } else if (a[i]>SLARGEST && a[i] != largest) {
                 SLARGEST=a[i];
             }
         }
             System.out.println(largest);
             System.out.println(SLARGEST);
         }
     }
    }
