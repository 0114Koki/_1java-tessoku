import java.util.Scanner;

public class sample1_4_own {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = s.nextInt();
        }
        boolean answer = false;

        for(int bit=0; bit < (1 << N); bit++){
            int sum = 0;
            for(int i=1; i<=N; i++){
                if((bit & (1 << i)) != 0) {
                    sum += A[i];
                }
            }
            if(sum == K) answer = true;
        }

        if(answer){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
