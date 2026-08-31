package java_arrays.Bai_tap;

import java.util.Scanner;

public class bai8 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        StringBuilder ds = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                count++;
                if (ds.length() > 0) {
                    ds.append(", ");
                }
                ds.append(arr[i]);
            }
        }

        System.out.println("Có số nguyên tố trong mảng: " + count+ ds);
    }
}

