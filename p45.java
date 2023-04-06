//WAP to perform selection sorting on string
    public class p45 {
        public static void main(String[] args) {
            char [] a={'a', 'c','b','e','x','z','y'};
            for(int i=0;i<a.length;i++)
            {
                int min=i;
                for (int j= i + 1; j<a.length;j++ ){
                    if(a[j]<a[min]){
                        min=j;
                    }
                }
               char temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
            for (int i=0;i< a.length;i++){
                System.out.println(a[i]+" ");
            }
        }
    }


