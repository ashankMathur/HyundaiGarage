import java.util.List;

public class Customer {

    private long customerId;
    private String customerName;
    private Car customerCar;
    private String customerVehicleNumber;
    private long customerPhoneNumber;
    private String customerEmailId;
    private List<HyundaiGarageService> servicesList;
    private double customerBill;

    public Customer(long customerId, String customerName, Car customerCar, String customerVehicleNumber, long customerPhoneNumber, String customerEmailId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerCar = customerCar;
        this.customerVehicleNumber = customerVehicleNumber;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailId = customerEmailId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Car getCustomerCar() {
        return customerCar;
    }

    public void setCustomerCar(Car customerCar) {
        this.customerCar = customerCar;
    }

    public String getCustomerVehicleNumber() {
        return customerVehicleNumber;
    }

    public void setCustomerVehicleNumber(String customerVehicleNumber) {
        this.customerVehicleNumber = customerVehicleNumber;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(Long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public void addService(HyundaiGarageService service){
        servicesList.add(service);
        System.out.println("Service Added");
    }
}
