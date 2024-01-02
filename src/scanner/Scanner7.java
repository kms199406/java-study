package scanner;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("하나의 정수를 입력하세요");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "는 짝수입니다");
        }else{
            System.out.println(num + "는 홀수 입니다");
        }
    }
}
