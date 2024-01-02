package scanner;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 입력해주세요");
        int n = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i +" = "+  i* n);

        }
    }
}
