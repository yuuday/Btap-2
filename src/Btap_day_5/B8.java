package Btap_day_5;

public class B8 {
    static void main() {
        int soLe = 1;
        int sum = 0;

        do {
            sum = sum + soLe;
            soLe = soLe + 2;
        } while (soLe <= 100);
        System.out.println("Tổng các số lẻ từ 1 đến 100 là: " + sum);
    }
}
