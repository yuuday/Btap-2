package Date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class P10_2_Bai5 {
    static void main(String[] args) {
        String logLine = "2026-10-06T14:30:45.123Z [ERROR] Database timeout";
        int spaceIndex = logLine.indexOf(" ");
        String isoTimestamp = logLine.substring(0, spaceIndex);
        String logMessage = logLine.substring(spaceIndex + 1);

        Instant instant = Instant.parse(isoTimestamp);
        ZoneId systemZone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, systemZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTime = localDateTime.format(formatter);

        System.out.printf("Chuỗi log Ban Đầu: %s \n", logLine);
        System.out.printf("Múi giờ hệ thống: %s \n", systemZone);
        System.out.printf("Thời gian sau Format: %s \n", formattedTime);
        System.out.printf("Nofication: %s \n", logMessage);
    }
}
