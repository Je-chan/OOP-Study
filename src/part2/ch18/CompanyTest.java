package part2.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        // 대표적으로 싱글톤 패턴을 사용하는 객체
        Calendar calendar = Calendar.getInstance();
    }
}
