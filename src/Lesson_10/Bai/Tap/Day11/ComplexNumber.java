package Lesson_10.Bai.Tap.Day11;

public class complexNumber {
    double real;
    double imaginary;

    public complexNumber() { //constructor không tham số
        this.real = 0;
        this.imaginary = 0;
    }
    public complexNumber(double real, double imaginary) { //constructor có tham số
        this.real = real;
        this.imaginary = imaginary;
    }
    public complexNumber add(complexNumber other) { // cộng hai số
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;

    }
    public complexNumber subtract(complexNumber other) { // trừ hai số
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;

    }
    public complexNumber mutiply(complexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary ;
        double newimaginary = this.real * other.real + this.imaginary * other.imaginary ;

    }
}
