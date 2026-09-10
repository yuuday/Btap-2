package Lesson_10.Bai.Tap.Day11;

public class Main {
    static void swap(Point p1, Point p2) {
        Point temp = p1;
        p1 = p2;
        p2 = temp;
        // Hàm không thực sự đổi vì sau khi khi kết thúc hàm này tất cả các giá trị bên trong sẽ biến mất
    }

    static void reset(Point p) {
        p.x = 0;
        p.y = 0;
    }

    static void main(String[] args) {
        Point P1 = new Point(3, 4);
        Point P2 = new Point(7, 8);

        System.out.println("Trước khi swap: ");
        System.out.println("P1 = (" + P1.x + ", " + P1.y + ")");
        System.out.println("P2 = (" + P2.x + ", " + P2.y + ")");

        swap(P1,P2);

        System.out.println("Sau khi swap: ");
        System.out.println("P1 = ( " + P1.x + " , "+ P1.y +")");
        System.out.println("P2 = ( " + P2.x + " , "+ P2.y +")");

        reset(P1);

        System.out.println("Sau Reset: ");
        System.out.println("P1 = (" + P1.x +" , "+ P1.y +")");
    }

}

