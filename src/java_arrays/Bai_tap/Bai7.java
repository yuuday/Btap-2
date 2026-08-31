package java_arrays.Bai_tap;

public class Bai7 {
    static void main(String[] args) {
        arrayMax(args);
    }


    static void arrayMax(String[] args) {
        int[] array = { 10, 5, 20, 02, 8, 15};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int x = array[i];

            if (x>max) {
                secondMax = max;
                max = x;
            }else if (x > secondMax && x < max){
                secondMax = x;
            }
        }
        System.out.println("Max: " + max);

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Khong ton tai");
        }else {
            System.out.println("Sô lớn thứ nhì: " + secondMax);
        }
    }
}
