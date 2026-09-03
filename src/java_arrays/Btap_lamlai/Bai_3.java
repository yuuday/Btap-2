package java_arrays.Btap_lamlai;

public class Bai_3 {
    static void main(String[] args) {

        int [] array = new int[] {1, 1, 1, 1};
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
// đoanj trên: ta cho phần tử đầu tiên làm mốc phần tử lớn và phần tử nhỏ nhất
        // gọi biến index để lưu vị trí của lớn nhất và nhỏ nhất--> ví dụ số array[0] lớn nhất ở vị trí 0
        for ( int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
                /*
                khi array[i] lớn hơn max thì lúc đó max mới bằng sẽ đc cập nhật thành array[i]
                lúc đó index sẽ cập nhật vị trí của array[i]
                */
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            } // tương tự với tìm max
        }
        System.out.printf("Value Max: %s has index %s \n", max, indexMax);
        if (max == min) {
            System.out.println("Hasn't Min");
        }else {

            System.out.printf("Value Min: %s has index %s", min, indexMin);
        }
// ở phần điều kiện cuối khi max = min thì sẽ hiển thị không có min
    }
}
