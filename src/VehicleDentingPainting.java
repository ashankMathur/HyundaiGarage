public class VehicleDentingPainting extends HyundaiGarageService {


    public VehicleDentingPainting(Long serviceId, double servicePrice, Long customerId, String serviceName) {
        super(serviceId, servicePrice, customerId, serviceName);
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
