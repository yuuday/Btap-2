package Date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class P10_2_Bai4 {
    public static long countWorkingDays(LocalDate start, LocalDate end) {
        if (start.isAfter(end)) { //Nếu ngày bắt đầu lớn hơn ngày kết thúc thì sẽ throw ra một lỗi và kết thúc chương trình
            throw new IllegalArgumentException("Ngày Bắt Đầu Làm Việc Không Được Sau Ngày Kết Thúc!");
        }
        long count = 0; // dùng để biến đếm số ngày làm việc hợp lệ
        LocalDate current = start; //current sẽ lưu ngày
        while (!current.isAfter(end)) { // ngày hiện tại không nằm sau ngày kểt thúc
            DayOfWeek dow = current.getDayOfWeek();
            if (dow != DayOfWeek.SATURDAY && dow != DayOfWeek.SUNDAY) {
                count++;
            }
            current = current.plusDays(1);
        }
        return count;
    }
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2026, 10, 1);
        LocalDate end = LocalDate.of(2029, 10, 1);

        System.out.printf("Từ ngày: %s ==> Đến ngày: %s \n", start, end );
        System.out.printf("Số Ngày Làm Việc: %s ngày", countWorkingDays(start, end));
    }
}
