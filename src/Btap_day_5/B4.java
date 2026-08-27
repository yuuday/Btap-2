package Btap_day_5;

import java.util.Scanner;

public class B4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số N: ");
        int n = sc.nextInt();

        int soGoc = n;
        int daoNguoc = 0;

        while (n !=0) {
            int chuSo = n % 10;
            daoNguoc = daoNguoc * 10 + chuSo;
            n = n / 10;
        }
        System.out.println("Số đảo ngược của " + soGoc + "là: " + daoNguoc);

    }
}
