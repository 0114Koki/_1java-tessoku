import java.util.Scanner;

public class ExA02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        int[] array = new int[N];
        for (int i=0; i<N; i++){
            array[i] = s.nextInt();
        }

        boolean flag = false;
        for (int i=0; i<N; i++){
            if (array[i] == X){
                flag = true;
            }
        }

        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
