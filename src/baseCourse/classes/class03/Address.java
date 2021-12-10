package baseCourse.classes.class03;

public class Address {
    private String addressType;
    private String addressStreetName;
    private String addressNumber;
    private String addressComplement;
    private String addressNeighborhood;
    private String addressUF;
    private String addressZIPCode;

    public Address(){
        super();
    }

    public Address(String addressType, String addressStreetName,
                   String addressNumber, String addressComplement,
                   String addressNeighborhood, String addressUF,
                   String addressZIPCode) {
        this.addressType = addressType;
        this.addressStreetName = addressStreetName;
        this.addressNumber = addressNumber;
        this.addressComplement = addressComplement;
        this.addressNeighborhood = addressNeighborhood;
        this.addressUF = addressUF;
        this.addressZIPCode = addressZIPCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressStreetName() {
        return addressStreetName;
    }

    public void setAddressStreetName(String addressStreetName) {
        this.addressStreetName = addressStreetName;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public String getAddressNeighborhood() {
        return addressNeighborhood;
    }

    public void setAddressNeighborhood(String addressNeighborhood) {
        this.addressNeighborhood = addressNeighborhood;
    }

    public String getAddressUF() {
        return addressUF;
    }

    public void setAddressUF(String addressUF) {
        this.addressUF = addressUF;
    }

    public String getAddressZIPCode() {
        return addressZIPCode;
    }

    public void setAddressZIPCode(String addressZIPCode) {
        this.addressZIPCode = addressZIPCode;
    }
}
