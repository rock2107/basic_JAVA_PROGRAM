//WAP TO PRINT ALL THE FACTORIAL OF THE RANGE
public class p6 {
    public static void main(String[] args) {
        for (int n=1;n<=7;n++)
        {
            int p = 1;
            int i;
            for (i = 1; i <= n; i++) {
                p = p * i;
            }
            System.out.println(p);
        }
    }
}