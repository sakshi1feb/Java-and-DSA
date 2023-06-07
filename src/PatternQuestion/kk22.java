package PatternQuestion;

import java.util.Scanner;

public class kk22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n = sc.nextInt();
        for (int r = 1; r <= n; r++) {
            if (r % 2 == 0) {
                for (int c = 1; c <= r; c++) {
                    if (c % 2 == 0)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                }
            } else if (r % 2 != 0) {
                for (int c = 1; c <= r; c++) {
                    if (c % 2 == 0)
                        System.out.print("0 ");
                    else
                        System.out.print("1 ");
                }
            }
            System.out.println();
        }
        }
    }

