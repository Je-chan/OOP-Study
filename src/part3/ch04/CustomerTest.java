package part3.ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + "구매 가격은 " + price + "원입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + "구매 가격은 " + price + "원입니다.");

    }
}
