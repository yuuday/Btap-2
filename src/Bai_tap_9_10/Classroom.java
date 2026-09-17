package Bai_tap_9_10;

public class Classroom {
    String className;
    Student[] students;
    int size;

    public Classroom(String className, int maxStudents) {
        this.className = className;
        students = new Student[maxStudents];
        size = 0;
    }

    static void main() {
        Classroom classroom = new Classroom("Class 1", 15);

        Student sv1 = new Student("Nguyễn Văn An", "sv1", 9.2);
        Student sv2 = new Student("Trần Văn Bình", "sv2", 7.5);
        Student sv3 = new Student("Lê Văn Cường", "sv3", 6.7);

        classroom.addStudent(sv1);
        classroom.addStudent(sv2);
        classroom.addStudent(sv3);

        Student top = classroom.findValedictorian();

        System.out.println("Lớp: " + classroom.className + " ( " + "Sĩ số: " + classroom.size + " )");
        System.out.println("Thủ khoa của lớp: " + top.name + " (" + " Điểm TB " + top.gpa + "-" + "Xếp loại: Giỏi" + " )");
        System.out.println("Điểm trung bình lớp: " + classroom.calculateClassAverage());
    }

    public void addStudent(Student s) {

        if (size >= students.length) {
            System.out.println("Lớp đã đầy!");
            return;
        }

        students[size] = s;
        size++;
    }

    public Student findValedictorian() {
        Student topStudent = students[0];

        for (int i = 1; i < size; i++) {
            if (students[i].gpa > topStudent.gpa) {
                students[i] = topStudent;
            }
        }
        return topStudent;
    }

    public double calculateClassAverage() {
        if (size == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < size; i++) {

            total += students[i].gpa;
        }
        return total / size;
    }
}