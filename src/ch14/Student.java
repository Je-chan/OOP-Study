package ch14;

public class Student {

    String studentNm;
    int money;

    public Student (String studentNm, int money) {
        this.studentNm = studentNm;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentNm + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
