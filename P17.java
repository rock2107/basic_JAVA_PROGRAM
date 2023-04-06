//ALL THE ODD DIGIT FROM THE NUMBER
public class P17 {
    public static void main(String[]args)
    {
        int n =2323;
        while (n!=0)
        {
            int d =n%10;
        if(d%2==1)
        {
            System.out.println(d);
        }
        n=n/10;
        }

    }
}
