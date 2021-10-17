import java.util.Date;

public class GarageEmployee {

    private long empId;
    private String empName;
    private Date dateOfJoin;
    private long empPhoneNumber;
    private String empEmailId;
    private String empAddress;

    public GarageEmployee(long empId, String empName, Date dateOfJoin, long empPhoneNumber, String empEmailId, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.dateOfJoin = dateOfJoin;
        this.empPhoneNumber = empPhoneNumber;
        this.empEmailId = empEmailId;
        this.empAddress = empAddress;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public long getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(long empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
}
