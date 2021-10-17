import java.util.List;

public class VehicleModification extends HyundaiGarageService {

    private List<Parts> modifyPartList;

    public VehicleModification(long serviceId, double servicePrice, long customerId, String serviceName, long empId) {
        super(serviceId, servicePrice, customerId, serviceName, empId);
    }


    @Override
    public void carWashing() {
        super.carWashing();
    }

    public void addParts(Parts part){
        modifyPartList.add(part);
        addModificationPrice(part.getPrice());
    }

    private void addModificationPrice(double price){
        servicePrice+=price;
    }

    public double modificationBill(){
        return this.servicePrice;
    }

    public List<Parts> showModifiedParts(){
        return modifyPartList;
    }

}
