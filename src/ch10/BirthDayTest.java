package ch10;

public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay date = new BirthDay();
        date.setYear(2023);
        date.setMonth(1);
        date.setDay(4);

        date.showDate();
    }
}
