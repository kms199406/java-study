package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요");

        int num1 = sc.nextInt();

        System.out.println("두번쨰 숫자를 입력하세요");

        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("두 숫자의 합 = " + sum);

    }
}
