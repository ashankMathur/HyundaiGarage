import java.util.List;

public class VehicleRepair extends HyundaiGarageService {

    private List<Parts> partList;

    public VehicleRepair(long serviceId, double servicePrice, long customerId, String serviceName, long empId) {
        super(serviceId, servicePrice, customerId, serviceName, empId);
    }


    @Override
    public void carWashing() {
        super.carWashing();
    }

    public void addParts(Parts part){
        partList.add(part);
        addRepairPrice(part.getPrice());
    }

    private void addRepairPrice(double price){
        servicePrice+=price;
    }

    public double repairBill(){
        return this.servicePrice;
    }

    public List<Parts> showRepairedParts(){
        return partList;
    }
    
}
