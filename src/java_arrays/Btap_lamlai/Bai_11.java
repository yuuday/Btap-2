package java_arrays.Btap_lamlai;

public class Bai_11 {
    public static boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) { // ở đây sẽ só sánh ở cả 2 đầu của mảng, nếu ở 2 đầu mà khác nhau thì sẽ lập tức retern false
                return false;
            }
        }
        return true; // nếu như ở hai đầu mà đã giống nhau thì sẽ được chuyển xuống
    }
    static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 1};
        if(isPalindrome(array)) {
            System.out.println("Mảng đối xứng");
        }
        else {
            System.out.println("Mảng KHÔNG đối xứng");
        }
    }
}
