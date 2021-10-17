public class VehicleServicing extends HyundaiGarageService {

    public VehicleServicing(Long serviceId, double servicePrice, Long customerId) {
        super(serviceId, servicePrice, customerId);
    }

    public void engineOiling(){
        System.out.println("Car Oiling done");
    }

    @Override
    public void carWashing() {
        super.carWashing();
    }

    public void steeringWheelAlignment(){
        System.out.println("Steering wheel is aligned");
    }

    public void brakeChecking(){
        System.out.println("Brakes are fixed and working fine!");
    }

}