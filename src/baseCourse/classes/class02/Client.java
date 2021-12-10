package baseCourse.classes.class02;

public class Client {
    private String clientFirstName;
    private String clientLastName;
    private int clientRG;
    private String clientProfession;

    // Constructor - Form I
    public Client(){}

    // Constructor - Form II
    public Client(String clientName01, String clientName02, int clientRGNumber, String clientWorkArea){
        this.clientFirstName = clientName01;
        this.clientLastName = clientName02;
        this.clientRG = clientRGNumber;
        this.clientProfession = clientWorkArea;
    }

    // * NEW * - Encapsulation concept
    public String getClientFirstName(){
        return clientFirstName;
    }

    public void setClientFirstName(String clientNameA){
        this.clientFirstName = clientNameA;
    }

    public String getClientLastName(){
        return clientLastName;
    }

    public void setClientLastName(String clientNameB){
        this.clientLastName = clientNameB;
    }

    public int getClientRG(){
        return clientRG;
    }

    public void setClientRG(int clientDocument01RG){
        this.clientRG = clientDocument01RG;
    }

    public String getClientProfession(){
        return clientProfession;
    }

    public void setClientProfession(String clientWorkTheme){
        this.clientProfession = clientWorkTheme;
    }
}
