package scanner;

import java.util.Scanner;

public class Scanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = 0;
        while (true) {
            System.out.println("숫자를 입력하세요 -1을 입력하면 종료합니다");
            input = sc.nextInt();
            if (input == -1) {
                System.out.println("결과가 나옵니다");
                break;
            }
            sum = sum + input;
            count++;
        }
        double average = (double) sum/count;

        System.out.println("입력한 숫자들의 합계 " + sum);
        System.out.println("입력한 숫자들의 평균 " + average);
    }
}
