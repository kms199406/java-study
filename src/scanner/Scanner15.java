package scanner;

import java.util.Scanner;

public class Scanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세가지 옵션중 하나를 선택하세요 1 = 상품입력, 2 = 결제, 3 = 종료");
        int totalCost = 0;
        while (true) {
            int option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                System.out.println("상품명을 입력하세요");
                String sang = sc.nextLine();
                System.out.println("가격을 입력하세요");
                int price = sc.nextInt();
                System.out.println("구매수량을 입력하세요");
                int su = sc.nextInt();
                totalCost += price * su;
                System.out.println("상품명 :" + sang + "가격 : " + "수량 " + "총가격" + totalCost);
            } else if (option == 2) {
                System.out.println("총 비용 :" + totalCost);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요");
            }
        }
    }
}
