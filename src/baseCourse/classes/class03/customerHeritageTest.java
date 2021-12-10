package baseCourse.classes.class03;

public class customerHeritageTest {
    public static void main(String[] args){
        NPCustomer NPCustomer01 = new NPCustomer();
        LPCustomer LPCustomer01 = new LPCustomer();

        Address client01Address = new Address();
        Address client02Address = new Address();

        NPCustomer01.setNPCPF("111.111.111-44");
        NPCustomer01.setNPFirstName("Albert");
        NPCustomer01.setCustomerAddress(client01Address);
        NPCustomer01.setNPBornDate("01/01/1996");
        NPCustomer01.setNPOccupation("STARS member");
        NPCustomer01.setNPAcademic(false);

        LPCustomer01.setLPCNPJ("1111-1111-1111.11");
        LPCustomer01.setLPArtificialName("Alpha team");

    }
}
