import java.util.List;

public class Customer {

    private Long customerId;
    private String customerName;
    private Car customerCar;
    private String customerVehicleNumber;
    private Long customerPhoneNumber;
    private String customerEmailId;
    private List<HyundaiGarageService> servicesList;
    private double customerBill;

    public Customer(Long customerId, String customerName, Car customerCar, String customerVehicleNumber, Long customerPhoneNumber, String customerEmailId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerCar = customerCar;
        this.customerVehicleNumber = customerVehicleNumber;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailId = customerEmailId;
    }

    public Long getCustomerId() {
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

    public Long getCustomerPhoneNumber() {
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

    public HyundaiGarageService addService(){
        //TODO Implement this
        return null;
    }
}
