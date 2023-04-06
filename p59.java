//WAP TO FIND LARGEST NUMBER IN ROW IN AN 2D ARRAY.
public class p59 {
    public static void main(String[] args) {
        int [][] a={{1,8,7},{9,6,5},{3,2,4}};
        for(int i=0;i<a.length;i++){
           int max=Integer.MIN_VALUE;
//            int max=0;
            for(int j=0;j<a[i].length;j++){
               if(a[i][j]>max){
                   max=a[i][j];

               }
            }
            System.out.println(max);
        }
    }
}
