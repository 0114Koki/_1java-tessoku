import java.util.Scanner;

public class ExB06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int Q = s.nextInt();
        int[] sum = new int[N + 1];
        sum[0] = 0;
        for (int i = 0; i < N; i++) {
            sum[i+1] = sum[i] + A[i];
        }

        for (int i = 0; i < Q; i++) {
            int L = s.nextInt();
            int R = s.nextInt();

            int wins = sum[R] - sum[L-1];
            int total = R - L + 1;
            int losses = total - wins;

            if(wins > losses){
                System.out.println("win");
            } else if(wins < losses){
                System.out.println("lose");
            } else {
                System.out.println("draw");
            }
        }
    }
}