//write a program to swap two numbers with using third variable

 class P11 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int temp=a;
        System.out.println("BEFORE SWAP");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("AFTRER SWAP");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}