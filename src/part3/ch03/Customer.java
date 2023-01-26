package part3.ch03;

public class Customer {
    protected int customerId;
    protected String customerNm;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    public Customer () {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() call!!");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }


    public String showCustomerInfo() {
        return customerNm + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
