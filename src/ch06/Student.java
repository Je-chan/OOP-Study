package ch06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {}

    // 생성자 함수를 내가 만들어내는 것
    // > constructor overloading
    public Student(int studentNumber, String studentName, int grade) {
        System.out.println("student 생성시작");
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다";
    }
}
