package java_arrays.Btap_lamlai;

public class Bai_13 {
    static void main(String[] args) {
    int[] array = {10, 20, 30, 40, 50};
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum = sum + array[i]; // hàm này tính tổng tất cả các số trên mảng để có thể chia lấy số trung bình
    }
    double avg = sum / array.length; // đây là hàm để chia trung bình của mảng ( ta sẽ lấy kết qủa bên trên sau khi công là sum và chia với số mảng có trong mảng array )
    String result = "";
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] > avg) {
            count++; // khi mà có các số lớn hơn số trung bình thì sẽ đếm các số đó
            result = result + array[i] + ", "; // dùng để nối các số lại với nhau ( gom kết quả )
        }
    }
    System.out.printf("Co %s so lon hon gia tri trung binh mang la: %s", count, result);
}
}
