package Lesson_10;

public class Student {
    private String studentId;
    private String fullName;
    private double theoryScore;
    private double practiceScore;

    public Student() {
        this.studentId = "Chưa có";
        this.fullName = "Chưa có";
        this.theoryScore = 0.0;
        this.practiceScore = 0.0;
    }

    public Student(String studentId, String fullName, double theoryScore, double practiceScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }
    public double calculateAvg() {
        return (this.theoryScore + this.practiceScore) / 2.0;
    }

    public String Rank() {
        double avg = this.calculateAvg();
        if (avg >= 8.0) return "Gioi";
        if (avg >= 6.5) return "Kha";
        if (avg >= 5.0) return "Trung binh";
        return "Yeu";
    }
    public void detail() {
        System.out.println("Ma SV: " + this.studentId + " Họ tên: " + this.fullName + " Điểm TB: " + this.calculateAvg() + " Xếp loại: " + this.Rank());
    }

    static void main(String[] args) {
        Student student1 = new Student("SV01", "Nguyễn Tiền Khôi", 8,8.5);
        Student student2 = new Student("SV02", "Trịnh Hồng Quân", 5.1, 4.2);

        student1.detail();
        student2.detail();


    }
}
