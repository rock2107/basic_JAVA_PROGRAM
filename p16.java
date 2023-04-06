//WAAP TO SEPARATE EACH DIGIT FROM THE NUMBER
public class p16 {
    public static void main(String[] args) {
        int n =531;
        while(n!=0){
            int d = n%10;
            System.out.println(d);
            n=n/10;

        }
    }
}
