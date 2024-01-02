package scanner;

import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요");
        String name = sc.nextLine();

        System.out.println("음식의 가격을 입력해주세요");
        int price = sc.nextInt();

        System.out.println("음식의 수량을 입력해주세요");
        int su = sc.nextInt();

        int totalPrice = price * su;

        System.out.println(name + su + " 개를 주문하셨습니다 " + " 총 가격은 " + totalPrice + "입니다" );
    }
}
