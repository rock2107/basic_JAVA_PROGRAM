
    //WAP to perform addition of  dignal in an matrix.
    public class p57 {
        public static void main(String[] args) {
            int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int sum1 = 0;
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                int j;
                for (j = 0; j < a.length; j++) {

                    if (i + j == 2) {
                        sum1 = sum1 + a[i][j];
                    }
                    if (i == j) {
                        sum = sum + a[i][j];
                    }
                }
//                System.out.println(sum1);
//                System.out.println(sum);
            }
            System.out.println(sum1);
            System.out.println(sum);

                int[][] b = {{1, 52, 3}, {4, 5, 6}, {7, 8, 9}};
                int sum2 = 0;
                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b[i].length; j++)

                        if (i + j == 2) {
                            sum2 = sum2+ b[i][j];
                        }

                }
            System.out.println(sum2);



        }
    }

