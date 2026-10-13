package Date;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class P10_3_Bai3 {
    static void main(String[] args) {
        String input = " Tôi là 1 pro player of java develop "
        List<UnaryOperator<String>> pipeline = Arrays.asList(
                String::trim,                           // 1. Cắt khoảng trắng 2 đầu
                String::toUpperCase,                    // 2. Viết hoa toàn bộ
                s -> s.replace("JAVA", "JAVA 8+")       // 3. Thay thế "JAVA" thành "JAVA 8+"
        );

        // Duyệt qua danh sách và áp dụng tuần tự từng bước lên chuỗi
        String result = input;
        for (UnaryOperator<String> operation : pipeline) {
            result = operation.apply(result);
        }

        // In kết quả để kiểm chứng
        System.out.println("Chuỗi ban đầu: '" + input + "'");
        System.out.println("Chuỗi sau khi xử lý: '" + result + "'");
    }
    }
}
