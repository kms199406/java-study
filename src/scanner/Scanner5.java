package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램을 종료합니다");

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요");
            int num1 = sc.nextInt();

            System.out.println("두번째 숫자를 입력하세요");
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }
            int sum = num1 + num2;
            System.out.println("두수의 합은 = " + sum);
        }
    }
}
