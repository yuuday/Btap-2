package Btap_day_5;

import java.util.Scanner;

public class B5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Cafe den:  20k$");
        System.out.println("2. Cafe sữa:  25k$");
        System.out.println("3. Sinh tố:  30k$");
        System.out.println("4. Nước ép:  35k$");
        System.out.println("5. Matcha Latte:  500k$");
        System.out.print("Nhập lựa chọn của bạn: ");

        int luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                System.out.println("Cafe Đen: 20k$");
                break;
            case 2:
                System.out.println("Cafe sữa: 25k$");
                break;
            case 3:
                System.out.println("Sinh tố: 30k$");
                break;
            case 4:
                System.out.println("Nước Ép: 35k$");
                break;
            case 5:
                System.out.println("Matcha latte: 500k$");
                break;
            default:
                System.out.println("Lựa Chọn Lỗi! Hãy chọn lại");
        }

    }
}
