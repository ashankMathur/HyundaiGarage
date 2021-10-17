public class HyundaiGarageService {

    private long serviceId;
    protected double servicePrice;
    private long customerId;
    private String serviceName;
    private long empId;


    public HyundaiGarageService(long serviceId, double servicePrice, long customerId, String serviceName, long empId) {
        this.serviceId = serviceId;
        this.servicePrice = servicePrice;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.empId = empId;
    }

    public void carWashing(){
        System.out.println("Car is washed");
    }

    public long getServiceId() {
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

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }


    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }
}
