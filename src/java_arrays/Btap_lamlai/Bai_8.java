package java_arrays.Btap_lamlai;

public class Bai_8 {
    // bài toán tìm số nguyên tố
    public static boolean isPrime(int n) {

        if (n < 2){
            return false; // lý do mà lại có điều kiện này vì số nguyên là số phải lớn hoặc bằng 2 ( 1 không phải số nguyên nên khi gặp số nào nhỏ hơn 2 thì sẽ lập tức false
        }
        if (n == 2){
            return true; // số 2 là số nguyên tố mà thường bị hiểu nhầm nên ta đặt điều kiện nếu bằng 2 thì sẽ true
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
                // vòng lặp for này để kiểm tra số đó có phải là số nguyên tố hay không ( vì 1 luôn là ước của mọi số nên ta lấy i = 2) nếu n chia hết cho 2 thì cõ nghĩa n có ước khác ngoài 1 và chính nó
            }// nên khi đó sẽ bị false ngay lập tức
        }
        return true;// còn nếu đã thoả mãn các điều kiện trên thì số đó là số nguyên tố

    }

    static void main(String[] args) {
        int countPrime = 0; // ta khai biến này để có thể đếm được số nguyên có trong mảng
        int[] array = {1, 2, 3, 4, 9, 11, 15, 20};

        String primeStr = "";
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i]))
                countPrime++;
            primeStr = primeStr + array[i] + ", ";
        }
        System.out.println("Có " + countPrime + " số nguyên tố trong mảng là: " + primeStr);
    }


}

