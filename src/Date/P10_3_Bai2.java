package Date;

import java.util.function.BiFunction;
import java.util.function.Function;

public class P10_3_Bai2 {
    static void main(String[] args) {
        Function<Double, Double> taxCalculator = grossSalary -> { // nhận vào một giá trị tổng lương và trả về một giá trị tiền thuế
            if (grossSalary > 20_000_000) {
                return grossSalary * 0.20;
            }
            return grossSalary * 0.10;// nếu lương đạt 20 triệu thì sẽ nhân với 20% thuế còn dưới 20tr thì sẽ nhân với 10% thuế
        };

        BiFunction<Double, Integer, Double> netSalaryCalculator = (baseSalary, coefficient) -> { // hàm này nhận vào hai tham số là lương cơ bản ( double ) và hệ số lương (integer ) sau đó trả ra lương thực nhận ( double )
            double grossSalary = baseSalary * coefficient; // tính tổng lương bằng lương cơ bản nhân với lương hệ số
            double tax = taxCalculator.apply(grossSalary); // hàm taxCalculator ở đây dùng để truyền tông lương để tính ra số tiền thuế phải nộp
            return grossSalary - tax;// lấy tổng lương để trừ đi tiền thuế để trả về mức lương thực nhận
        };

        double base1 = 5_000_000;
        int coef1 = 3;
        System.out.printf("Nhân viên a: Lương thực lĩnh = %,.0f VNĐ\n", netSalaryCalculator.apply(base1, coef1));

        double base2 = 10_000_000;
        int coef2 = 3;
        System.out.printf("Nhân viên b: Lương thực lĩnh = %,.0f VNĐ\n", netSalaryCalculator.apply(base2, coef2));
    }