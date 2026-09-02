package java_arrays.Btap_lamlai;

public class Bai_7 {

    static void main(String[] args) {
        int[] array = new int[] {1, 3, 7, 6};
        int max = Integer.MIN_VALUE; // phần này em chưa hiểu lắm Integer. MIN_VALUE là phần tử nhỏ nhất có thể gán ??
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { // t coi phần tử đầu tiên là lớn nhất ( max ) khi so sánh đến phần từ kế đó nếu lớn hơn max hiện tại thì sẽ cập nhật phần tử đó là max mới
                secondMax = max; // ở đây sẽ tìm max lớn thứ 2 sau khi max mới đa được cập nhật thì max cũ sẽ được gán thành max lớn thứ 2
                max = array[i]; // khi đã tìm được max mới thì giá trị lớn nhất vừa tìm được sẽ được gán vào max
            }
        }
        System.out.println("Max: " + max);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ 2: ");
        }else {
            System.out.println("Số lớn nhất = " + max + ", " + "Số lớn thứ 2 = " + secondMax);
        }

    }

}