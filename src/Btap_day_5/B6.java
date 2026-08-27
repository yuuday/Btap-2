//package Btap_day_5;
//import java.util.Scanner;
//public class B6 {
//    public static double calculateDiscount(double price, String discountCode) {
//
//        if (discountCode.equals("VIP")) {
//            return price * 0.8;
//        }
//        if (discountCode.equals("MEMBER")) {
//            return price * 0.9;
//        }
//        System.out.println("Ma Khong Dung!");
//        return 0;
//    }
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        double sumMoney = 0;
//
//        while (true) {
//            System.out.print("nhap gia tien mon hang: ");
//            double price = sc.nextDouble();
//            if (price == 0) {a
//                break;
//            }
//            if (price < 0) {
//                System.out.println("Gia khong hop le! ");
//                continue;
//            }
//            sumMoney += price;
//            System.out.println("Da Them " + price +" Vao Gio Hang");
//        }
//        System.out.println("TOng Tien Phai Tra: " + sumMoney);
//
//    }
//}
// Khong hieu ?????
