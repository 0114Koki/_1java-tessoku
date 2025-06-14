import java.util.Scanner;

public class sample1_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // 要素数
        int K = s.nextInt(); // 目標の合計
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = s.nextInt();

        boolean answer = false;

        // 2^N 通りの組み合わせをチェック
        for (int bit = 0; bit < (1 << N); bit++) {
            int sum = 0;

            // 各ビットをチェック
            for (int i = 0; i < N; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += A[i]; // i番目の要素を選んだ
                }
            }

            if (sum == K) {
                answer = true;
                break; // 見つかったので探索終了してもOK
            }
        }

        System.out.println(answer ? "Yes" : "No");
    }
}
