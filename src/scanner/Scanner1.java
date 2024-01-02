package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("입력한 문자열 " + str);

        System.out.println("정수를 입력하세요: ");
        int intValue = sc.nextInt();
        System.out.println("입력한정수 : " + intValue);
    }
}
