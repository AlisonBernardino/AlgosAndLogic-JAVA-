package baseCourse.classes.class03;

// NP = Natural Person
public class NPCustomer extends Customer{
    private String NPFirstName;
    private String NPCPF;
    private String NPBornDate;
    //private String NPAddress;
    private String NPOccupation;
    private boolean isNPAcademic;

    public NPCustomer(){
        super();
    }

    public NPCustomer(String customerName, String customerEmail,
                      String customerCellphone, Address customerAddress,
                      String customerAccountOpening,
                      String customerAccountAnalysisRisk,
                      double customerIncome, String NPFirstName,
                      String NPCPF, String NPBornDate,
                      // String NPAddress,
                      String NPOccupation,
                      boolean isNPAcademicMember) {
        super(customerName, customerEmail, customerCellphone,
                customerAddress, customerAccountOpening,
                customerAccountAnalysisRisk, customerIncome);
        this.NPFirstName = NPFirstName;
        this.NPCPF = NPCPF;
        this.NPBornDate = NPBornDate;
        this.NPOccupation = NPOccupation;
        this.isNPAcademic = isNPAcademicMember;
    }

    public String getNPFirstName() {
        return NPFirstName;
    }

    public void setNPFirstName(String NPFirstName) {
        this.NPFirstName = NPFirstName;
    }

    public String getNPCPF() {
        return NPCPF;
    }

    public void setNPCPF(String NPCPF) {
        this.NPCPF = NPCPF;
    }

    public String getNPBornDate() {
        return NPBornDate;
    }

    public void setNPBornDate(String NPBornDate) {
        this.NPBornDate = NPBornDate;
    }

    /*
    public String getNPAddress() {
        return NPAddress;
    }

    public void setNPAddress(String NPAddress) {
        this.NPAddress = NPAddress;
    }

     */

    public String getNPOccupation() {
        return NPOccupation;
    }

    public void setNPOccupation(String NPOccupation) {
        this.NPOccupation = NPOccupation;
    }

    public boolean isNPAcademic() {
        return isNPAcademic;
    }

    public void setNPAcademic(boolean NPAcademic) {
        isNPAcademic = NPAcademic;
    }
}
