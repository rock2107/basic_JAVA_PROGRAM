
import java.util.Arrays;
import java.util.Scanner;

    public class p43 {

        public static int[] insert(int index, int element, int a[]){
            if (index<0 || index>a.length) {
                System.out.println("Index not found");
                return a;
            }
            int[] b = new int[a.length+1];
            for (int i = 0; i < a.length; i++) {
                if (i<index) {
                    b[i] = a[i];
                }
                else {
                    b[i+1]=a[i];
                }
                b[index]= element;
            }
            return b;
        }

        public static int[] update(int index, int element, int[] a) {
            if (index<0 || index >= a.length) {
                System.out.println("Index not found");
                return a;
            }
            a[index]= element;
            return a;
        }

        public static int[] delete(int index, int[] a) {
            if (index<0 || index >= a.length) {
                System.out.println("Index not found");
                return a;
            }
            int[] b = new int[a.length-1];
            for (int i = 0; i < b.length; i++) {
                if (i < index) {
                    b[i]= a[i];
                }
                else {
                    b[i] = a[i+1];
                }
            }
            return b;
        }

        public static int[] read(int[] a) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(" " + a[i]);
            }
            return a;
        }

        public static void main(String[] args) {
            int[] a = {27, 42, 56, 76, 39, 18};
            System.out.println("The given array is ");
            System.out.println(Arrays.toString(a));
            mainMenu(a);



		/*int index = 4;
		int element = 88;
		a = insert(index, element, a);
		System.out.println(Arrays.toString(a));


		index = 6;
		element = 96;
		a = update(index, element, a);
		System.out.println(Arrays.toString(a));

		index= 2;
		a = delete(index, a);
		System.out.println(Arrays.toString(a));

		a = read(a);*/
        }

        public static void mainMenu(int[] a) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to insert a new value in an array");
            System.out.println("Enter 2 to Read an array");
            System.out.println("Enter 3 to Update an element from an array");
            System.out.println("Enter 4 to Delete an element from an array");
            int value = sc.nextInt();
            switch (value) {
                case 1: {
                    System.out.println("Enter the index where you want to insert value");
                    int index = sc.nextInt();
                    System.out.println("Enter the element to insert");
                    int element = sc.nextInt();
                    a = insert(index, element, a);
                    System.out.println(Arrays.toString(a));
                    break;
                }
                case 2: {
                    a = read(a);
                    break;
                }
                case 3: {
                    System.out.println("Enter the index where you want to update value");
                    int index = sc.nextInt();
                    System.out.println("Enter the element to Update");
                    int element = sc.nextInt();
                    a = update(index, element, a);
                    System.out.println(Arrays.toString(a));
                    break;
                }
                case 4: {
                    System.out.println("Enter the index where you want to delete value");
                    int index= sc.nextInt();
                    a = delete(index, a);
                    System.out.println(Arrays.toString(a));
                    break;
                }
                default:
                    System.out.println("Please enter valid input");
                    mainMenu(a);
            }
        }
    }


