package part3.ch03;

public class VIPCustomer extends Customer {
    double salesRatio;
    String agentId;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public VIPCustomer () {
        // 컴파일러가 상위 클래스를 호출하는 것이 없으면 알아서 호출한다
        // super();

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIP Customer() Call");
    }
}
