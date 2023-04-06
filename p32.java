import java.util.Scanner;

//WAP to print all the even number of an array
public class p32 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int []a =new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the number of element of the array");
            a[i]= sc.nextInt();
        }

        System.out.println("==========================");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            } else if (a[i]!=0)

            {
                System.out.println("no even number is present in array");
            }

        }
    }
}
