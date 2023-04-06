//WAP to multiply two matrix.
public class p65 {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{1,2,3},{1,2,3}};
        int [][]b={{1,2,3},{1,2,3},{1,2,3}};
        for(int i=0;i<3;i++){
            for (int j =0;j<3;j++){
                int sum=0;
                for(int k=0;k<3;k++){
                    sum=sum+a[i][k]*b[k][j];
                }
                System.out.print(sum+" ");
                }
            System.out.println();
            }
        }
}

