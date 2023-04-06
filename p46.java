//WAP TO PERFROM BINARY SEARCH ON AN ARRAY

public class p46 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int search=5;
        int sp=0;
        int ep=a.length-1;
        int mp=(sp+ep)/2;
        while(sp<=ep){
            if(search == a[mp]){
                System.out.println("index found at" +mp);
                break;
            } else if (search> a[mp]) {
                sp=sp+1;
            } else if (search<a[mp]) {
                ep=mp-1;
            }
            mp=(sp+ep)/2;

        }
        if(sp> ep){
            System.out.println(" the element not found");
        }
    }
}
