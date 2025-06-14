import java.util.Scanner;

public class ExA05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int ans = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                int z = K - i - j;
                if(z>=1 && z <= N){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
