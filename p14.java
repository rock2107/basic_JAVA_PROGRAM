//wap to print 'foo' if the number is divisble by 5 an boo if the number is divisble by 7 and fooboo if the number is divisible by both 5 and 7 in the ranre of 1-100

public class p14 {
    public static void main(String[] args) {

        {
            for(int i=1;i <=100;i++)
            {
                 if (i%5==0 && i%7==0){
                    System.out.println(i+"FOOBOO");
                }
                else if(i%5==0)
                {
                    System.out.println(i+"foo");
                }
             if(i%7==0)
             {
                    System.out.println(i+"boo");
             }

            }
        }
    }
}
