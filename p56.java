//WAP to perform addition of  dignal in an matrix.
public class p56 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (i == j) {
                    sum = sum + a[i][j];
                }
            }
//            System.out.println(sum);
        }
        System.out.println(sum);

    }
}