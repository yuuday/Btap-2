package Lesson_10;

public class Bai_1 {
    private double radius; // tao fields cho class

    public Bai_1(){ // Constructor không tham số
        this.radius = 1.0; // khi tạo 1 object mới thì tham số sẽ dược để auto là 1
    }
    public Bai_1(double radius) { // Constructor có tham số
    if ( radius <= 0) {
        System.out.println("Canh bao ban kinh phai > 0. Nen mac dinh la 1.0");
        this.radius = 1.0; // logic ở đây là khi gán giá trị nhỏ hơn hoặc bằng 0 thì lập tức sẽ báo lỗi và đưa giá trị về mặc định là 1
    }else {
        this.radius = radius;
    }
    }
    public double calculateArea() { // hàm tính diện tích và công thức tính diện tích hình tròn
        return Math.PI  *  this.radius  *  this.radius;
    }
    public double calculatePerimeter() { // hàm tính chu vi và công thức tính chu vi hình tròn
        return 2 * Math.PI * this.radius ;
    }
    public void displayInfo(String label) { // tham số string label cho phép gắn nhãn để phân biệt và dùng hàm void ( không trả về giá trị chỉ dùng để in ra màn hình )
        System.out.printf("[%s] Bán kính: %.2f | Chu vi: %.2f | Diện tích: %.2f\n", label, this.radius, this.calculatePerimeter(), this.calculateArea());
    }
    public static void main(String[] args) {
        Bai_1 circle1 = new Bai_1();
        circle1.displayInfo("Hình tròn 1");

        Bai_1 circle2 = new Bai_1(4.2);
        circle2.displayInfo("Hình tròn 2");
    }
}
