//WAP to perform addition of its row
public class p54 {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        int sum;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=0;j<a[i].length;j++){
               sum=sum+a[i][j];

            }
            System.out.println(i+1+"sum of row:"+sum);
        }
    }
}
