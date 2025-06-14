import java.util.Scanner;

public class ExA04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String result = "";
        for(int x=9; x>=0; x--){
            int wari = (int) Math.pow(2, x);
            int bit = (N / wari) % 2;
            result += bit;
        }
        System.out.println(result);
        s.close();
    }
}
/// result += bit <= 文字列に入れる
//1
//12
//123
//1234