package Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ai_1 {
    static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(2005, 02, 01); //khởi tạo hàm sinh nhật và truyền dữ liệu ngày sinh
        LocalDate today = LocalDate.now();// hàm lấy ngày hôm nay
        System.out.println("Ngày hôm nay" + today);
        System.out.println("Ngày sinh nhật" + birthDay);

        LocalDate nextBirthDay = birthDay.withYear(today.getYear());//hàm withYear dùng để giữ lại ngày tháng sinh và thay thể năm sinh thành năm hiện tại => ta sẽ có được sinh nhật năm nay

        if (nextBirthDay.isBefore(today) || nextBirthDay.isEqual(today)) { // điều kiện này có nghĩa là sinh nhật năm nay đã qua thì sẽ không đếm nữa
            nextBirthDay = nextBirthDay.plusYears(1); // dùng hàm +1 năm để tính năm tiếp
        }
        long dayRemaining = ChronoUnit.DAYS.between(today, nextBirthDay); // hàm này dùng để tính khoảng cách từ hôm nay đến sinh nhật tiếp theo là bao nhiêu ngày

        System.out.println("Sinh nhật kế tiếp là ngày: " + nextBirthDay);
        System.out.println("Còn lại: " + dayRemaining + " ngày là đến sinh nhật tiếp theo!");
    }
}
