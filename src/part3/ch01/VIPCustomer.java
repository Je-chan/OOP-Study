package part3.ch01;

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
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }
}
