//WAP TO FIND LARGEST VALUE IN AN ARRAY
 class p41 {
    public static void main(String[] args) {
        int[] a={488,30,-1,-5,652};
        int LARGEST =Integer.MIN_VALUE;
        {for( int i=0;i<a.length;i++){
            if(a[i]>LARGEST){
                LARGEST=a[i];
            }
        }
            System.out.println(LARGEST);
        }
    }
}
