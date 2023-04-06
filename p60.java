//find the row and column
//find the sum of row and column
//if the sum is even the print than sum of all the even number digits
public class p60 {
    public static  int sum(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
//        int [][]a={{11,22,33},{44,55,66},{77,88,99}};
       int a [][] ={{454,55,521,14},{78,326,104,989},{23447,174,87,845},{25,81,53,11}};
       int r=0;
       int c=0;

       int n=104;

       for(int i=0;i<a.length;i++){
           for (int j=0;j<a[i].length;j++){
               if(a[i][j]==n){
                   r=i;
                   c=j;
               }
           }

       }
       int sum=0;
       if((r+c)%2==0){
           for (int i=0;i<a.length;i++){
               for (int j=0;j<a[i].length;j++){
                   if(a[i][j]%2==0){
                       sum=sum + sum(a[i][j]);
                   }
               }

           }
           System.out.println(sum);
       }
       else{
           for (int i=0;i<a.length;i++){
               for (int j=0;j<a[i].length;j++){
                   if(a[i][j]%2!=0){
                       sum=sum + sum(a[i][j]);
                   }
               }

           }
           System.out.println(sum);
       }

    }

}



