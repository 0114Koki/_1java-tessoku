import java.util.Scanner;

public class ExB02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        boolean flag = false;
        for(int i=A; i<=B; i++){
           if(100%i==0){
               flag=true;
           }
        }
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
