public class Client {
    public Contract returnRentalContract() {
        ContractBuilder contractBuilder = new PermanentContractBuilder();

        return contractBuilder.setContractID("C123")
                .setPropertyID("P456")
                .setTenantID("T789")
                .setRentAmount(1500)
                .signContract();
    }

    
}