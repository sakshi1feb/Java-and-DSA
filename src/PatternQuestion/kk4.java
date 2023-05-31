package PatternQuestion;
/**
 *     1
 *     1 2
 *     1 2 3
 *     1 2 3 4
 *     1 2 3 4 5
 * */
import java.util.Scanner;

public class kk4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i-j>=0)
                    System.out.print(j+1 +" ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
