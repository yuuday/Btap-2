package Btap_day_5;

import java.util.Scanner;

public class B4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số N: ");
        int n = sc.nextInt();

        int number = n;
        int reverse = 0;

        while (n !=0) {
            int chuSo = n % 10;
            reverse = reverse * 10 + number;
            n = n / 10;
        }
        System.out.println("Số đảo ngược của " + number + "là: " + reverse);

    }
}
