package part3.ch03;

public class CustomerTest {
    public static void main(String[] args) {

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerNm("김유신");
        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
