import java.util.List;

public class VehicleRepair extends HyundaiGarageService {

    private List<Parts> partList;

    public VehicleRepair(Long serviceId, double servicePrice, Long customerId) {
        super(serviceId, servicePrice, customerId);
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
