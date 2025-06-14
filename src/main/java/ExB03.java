import java.util.Scanner;

public class ExB03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i] = s.nextInt();
        }

        boolean flag = false;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    if(array[i]+array[j]+array[k] == 1000){
                        flag=true;
                        break;
                    }
                }
            }
        }
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
