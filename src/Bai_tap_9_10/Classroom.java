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
        Student sv4 = new Student("Trịnh Hồng Quân", "sv4", 9.5);
        Student sv5 = new Student("B", "sv5", 8.5);
        Student sv6 = new Student("C", "sv6", 7.5);
        Student sv7 = new Student("D", "sv7", 6.5);
        Student sv8 = new Student("A", "sv8", 9.6);
        Student sv9 = new Student("E", "sv9", 6.6);
        Student sv10 = new Student("F", "sv10", 5.0);
        Student sv11 = new Student("G", "sv11", 3.6);
        Student sv12 = new Student("H", "sv12", 9.9);

        classroom.addStudent(sv1);
        classroom.addStudent(sv2);
        classroom.addStudent(sv3);
        classroom.addStudent(sv4);
        classroom.addStudent(sv5);
        classroom.addStudent(sv6);
        classroom.addStudent(sv7);
        classroom.addStudent(sv8);
        classroom.addStudent(sv9);
        classroom.addStudent(sv10);
        classroom.addStudent(sv11);
        classroom.addStudent(sv12);

        Student top = classroom.findValedictorian();

        System.out.println("Lớp: " + classroom.className + " ( " + "Sĩ số: " + classroom.size + " )");
        System.out.println("Thủ khoa của lớp: " + top.name + " (" + " Điểm TB " + top.gpa + " - " + "Xếp loại: Giỏi" + " )");
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
                topStudent = students[i];
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