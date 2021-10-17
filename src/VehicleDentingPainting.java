public class VehicleDentingPainting extends HyundaiGarageService {


    public VehicleDentingPainting(long serviceId, double servicePrice, long customerId, String serviceName, long empId) {
        super(serviceId, servicePrice, customerId, serviceName, empId);
    }

    @Override
    public void carWashing() {
        super.carWashing();
    }

    public void denting(){
        System.out.println("Car denting completed");
    }

    public void paintTouching(){
        System.out.println("Painting and touching completed");
    }
}
