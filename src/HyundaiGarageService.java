public class HyundaiGarageService {

    private Long serviceId;
    protected double servicePrice;
    private Long customerId;
    private String serviceName;

    public HyundaiGarageService(Long serviceId, double servicePrice, Long customerId, String serviceName) {
        this.serviceId = serviceId;
        this.servicePrice = servicePrice;
        this.customerId = customerId;
        this.serviceName = serviceName;
    }

    public void carWashing(){
        System.out.println("Car is washed");
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
