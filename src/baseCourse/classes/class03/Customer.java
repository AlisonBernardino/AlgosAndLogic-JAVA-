package baseCourse.classes.class03;

public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerCellphone;
    private Address customerAddress;
    private String customerAccountOpening;
    private String customerAccountAnalysisRisk;
    private double customerIncome;

    public Customer(){
        super();
    }

    public Customer(String customerName, String customerEmail,
                    String customerCellphone, Address customerAddress,
                    String customerAccountOpening,
                    String customerAccountAnalysisRisk,
                    double customerIncome) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerCellphone = customerCellphone;
        this.customerAddress = customerAddress;
        this.customerAccountOpening = customerAccountOpening;
        this.customerAccountAnalysisRisk = customerAccountAnalysisRisk;
        this.customerIncome = customerIncome;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerCellphone() {
        return customerCellphone;
    }

    public void setCustomerCellphone(String customerCellphone) {
        this.customerCellphone = customerCellphone;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAccountOpening() {
        return customerAccountOpening;
    }

    public void setCustomerAccountOpening(String customerAccountOpening) {
        this.customerAccountOpening = customerAccountOpening;
    }

    public String getCustomerAccountAnalysisRisk() {
        return customerAccountAnalysisRisk;
    }

    public void setCustomerAccountAnalysisRisk(String customerAccountAnalysisRisk) {
        this.customerAccountAnalysisRisk = customerAccountAnalysisRisk;
    }

    public double getCustomerIncome() {
        return customerIncome;
    }

    public void setCustomerIncome(double customerIncome) {
        this.customerIncome = customerIncome;
    }
}
