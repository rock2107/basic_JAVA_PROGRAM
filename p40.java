//WAP TO FIND SMALLEST VALUE IN AN ARRAY
public class p40 {
    public static void main(String[] args) {
        int[] a={488,30,-1,-5,652};
        int small =Integer.MAX_VALUE;
        {for( int i=0;i<a.length;i++){
                if(a[i]<small){
                    small=a[i];
                }
            }
            System.out.println(small);
        }
    }
}
