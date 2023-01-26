package part3.ch04;

public class VIPCustomer extends Customer {
    double salesRatio;
    String agentId;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public VIPCustomer (int customerId, String customerNm) {
        // 컴파일러가 상위 클래스를 호출하는 것이 없으면 알아서 호출한다
         super(customerId, customerNm);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIP Customer() Call");
    }

    // 컴파일러에게 Override 된 것이라고 알려주는 어노테이션
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}
