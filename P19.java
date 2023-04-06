//WAP TO FIND SUM OF ALL DIGITS OF NUMBER
 class p19 {
    public static void main(String[] args)
    {
        int n =34;
        int PRO=1;
        while(n!=0){
            int d = n%10;
            PRO=PRO*d;
            n=n/10;
        }
        System.out.println(PRO);
    }
}
