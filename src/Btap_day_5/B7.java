package Btap_day_5;
import java.util.Scanner;
public class B7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matKhau;

        do {
            System.out.print("Nhập mật khẩu: ");
            matKhau = sc.nextLine();

            if (!matKhau.equals("admin123")) {
                System.out.println("Sai mật khẩu! Vui Lòng Thử Lại.");
            }
        } while (!matKhau.equals("admin123"));
        System.out.println("Đăng Nhập Thành Công.");
    }
}
