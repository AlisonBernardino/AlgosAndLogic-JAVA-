package baseCourse.classes.class03;

// LP = Legal Person
public class LPCustomer extends Customer{
    private String LPCNPJ;
    private Address LPCommercialAddress;
    private String LPSegment;
    private String LPArtificialName;
    private String fundationDate;

    public LPCustomer(){
        super();
    }

    public LPCustomer(String LPCNPJ, Address LPCommercialAddress,
                      String LPSegment,
                      String LPArtificialName,
                      String fundationDate) {
        this.LPCNPJ = LPCNPJ;
        this.LPCommercialAddress = LPCommercialAddress;
        this.LPSegment = LPSegment;
        this.LPArtificialName = LPArtificialName;
        this.fundationDate = fundationDate;
    }

    public String getLPCNPJ() {
        return LPCNPJ;
    }

    public void setLPCNPJ(String LPCNPJ) {
        this.LPCNPJ = LPCNPJ;
    }

    public Address getCommercialAddress() {
        return LPCommercialAddress;
    }

    public void setCommercialAddress(Address commercialAddress) {
        this.LPCommercialAddress = commercialAddress;
    }

    public String getLPSegment() {
        return LPSegment;
    }

    public void setLPSegment(String LPSegment) {
        this.LPSegment = LPSegment;
    }

    public String getLPArtificialName() {
        return LPArtificialName;
    }

    public void setLPArtificialName(String LPArtificialName) {
        this.LPArtificialName = LPArtificialName;
    }

    public String getFundationDate() {
        return fundationDate;
    }

    public void setFundationDate(String fundationDate) {
        this.fundationDate = fundationDate;
    }
}
