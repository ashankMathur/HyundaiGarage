import java.util.List;

public class VehicleRepair extends HyundaiGarageService {

    private List<Parts> partList;

    public VehicleRepair(Long serviceId, double servicePrice, Long customerId, String serviceName) {
        super(serviceId, servicePrice, customerId, serviceName);
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
