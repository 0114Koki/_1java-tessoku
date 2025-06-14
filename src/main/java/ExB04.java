import java.util.Scanner;

public class ExB04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int ans = 0;
        for(int i=0; i<=7; i++){
            ans += (int) ( (N % 10) * Math.pow(2, i));
            N = N / 10;
            //System.out.println(ans);
        }
        System.out.println(ans);
    }
}
