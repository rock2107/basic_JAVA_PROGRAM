//WAP to perform addition of its column
public class p55 {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        int sum;
        int Rsum;
        for(int i=0;i<a.length;i++){
            sum=0;
            Rsum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
                Rsum=Rsum+a[j][i];
            }
            System.out.println(i+1+"sum of row:"+sum);
           System.out.println(i+1+"sum of col:"+Rsum);
        }

    }
}

