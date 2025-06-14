import java.util.Scanner;

public class ExA06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        int[] A = new int[N];
        int[] sum = new int[N+1];
        for(int i=0; i<N; i++){
            A[i] = s.nextInt();
        }
        sum[0] = 0;
        for(int i=0; i<N; i++){
            sum[i+1] = sum[i] + A[i];
        }
        for(int i=0; i<Q; i++){
            int L = s.nextInt();
            int R = s.nextInt();
            int ans = sum[R] - sum[L-1];
            System.out.println(ans);
        }

    }
}
