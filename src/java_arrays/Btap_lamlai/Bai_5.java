package java_arrays.Btap_lamlai;

public class Bai_5 {
    static void main(String[] args) {
        int[] array = new int[] {22, 42, 77,};
        boolean isSorted = true;
// gọi biến isSorted = true biến này sẽ cho là mảng trên đã được sắp xếp rồi kiểm tra mảng trên nếu đã được sắp xếp thì là true còn chưa được sắp xếp thì biến sẽ đổi thành false

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) { /* vì sao ở đây là array[i + 1]
            ví dụ phần tử đầu tiên là array[0] = 100 thì array [0 + 1] sẽ là phần tử ở ngay phía sau là 22
            kiểm tra 100 > 22 => không tăng dần
                */
                isSorted = false; // sau khi duyệt các điều kiện ở trên thì đến phần này sẽ được cho đến là mảng trên chưa được sắp xếp tăng dần
                break;// khi đó thì sẽ không cần kiểm tra tiếp và thoát vòng lặp for
            }
        }
        if (isSorted) {
            System.out.println("Đã được sắp xếp tăng dần");
        } else {
            System.out.println("Chưa được sắp xếp tăng dần");
        }
    }
}
