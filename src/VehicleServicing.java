public class VehicleServicing extends HyundaiGarageService {


    public VehicleServicing(long serviceId, double servicePrice, long customerId, String serviceName, long empId) {
        super(serviceId, servicePrice, customerId, serviceName, empId);
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
