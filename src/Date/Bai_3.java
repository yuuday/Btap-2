package Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Bai_3 {
    static void main(String[] args) {
        LocalDateTime meetingLocal = LocalDateTime.of(2026, 10, 11, 20, 0);
        ZoneId vnZone = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime vnMeeting = ZonedDateTime.of(meetingLocal, vnZone);

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoMeeting = vnMeeting.withZoneSameInstant(tokyoZone);// chuyển đổi giờ từ giờ việt nam sang giờ nhật bản (tokyo)

        ZoneId nyZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkMeeting = vnMeeting.withZoneSameInstant(nyZone);// chuyển đỏi giờ việt nam sang giờ mẽo ( nyc )

        DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss (z, Z)");


        System.out.println("_____Lịch Họp Quốc Tế_____");
        System.out.println("VietNam Number 1 : " + vnMeeting.format(formated));
        System.out.println("Tokyo Number 5.  : " + tokyoMeeting.format(formated));
        System.out.println("NewYork Number 10: " + newYorkMeeting.format(formated));
    }
}
