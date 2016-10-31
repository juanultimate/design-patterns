package ec.edu.juanultimate.patterns.creational.factorymethod;


public class AdminBasicSupport {
    private Integer SLA = 40;
    private Integer allowedTickets = 9999;

    public Integer getSLA() {
        return SLA;
    }

    public Integer getAllowedTickets() {
        return allowedTickets;
    }
}
