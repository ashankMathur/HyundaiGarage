import java.util.Date;

public class Parts {

    private Long partId;
    private Car car;
    private String partName;
    private double price;
    private Date dateOdPurchase;
    private int quantity;

    public Parts(Long partId, Car car, String partName, Date dateOdPurchase, int quantity, double price) {
        this.partId = partId;
        this.car = car;
        this.partName = partName;
        this.dateOdPurchase = dateOdPurchase;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Date getDateOdPurchase() {
        return dateOdPurchase;
    }

    public void setDateOdPurchase(Date dateOdPurchase) {
        this.dateOdPurchase = dateOdPurchase;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int n){
        this.quantity+=quantity;
    }

    public void reduceQuantity(int n){
        this.quantity-=quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
