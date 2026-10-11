package Date;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Bai_2 {
    public static void main(String[] args) {
        String issuedDateStr = "10/2026";
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/yyyy"); //format của ngày tháng

        YearMonth issuedYearMonth = YearMonth.parse(issuedDateStr, inputFormatter);//Parse sang YearMonth

        YearMonth expiryYearMonth = issuedYearMonth.plusYears(3);// hàm này sẽ công thêm 3 năm từ ngày phát hành thẻ

        LocalDate expiryDate = expiryYearMonth.atEndOfMonth();

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // chuyển đổi thành format ngày kiểu việt nam
        System.out.println("Tháng phát hành    : " + issuedDateStr);
        System.out.println("Tháng hết hạn thẻ  : " + expiryYearMonth.format(inputFormatter));
        System.out.println("Ngày hết hạn cuối  : " + expiryDate.format(outputFormatter));
    }
}
