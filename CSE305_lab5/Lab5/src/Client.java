public class Client {
    
    public Contract returnRentalContract(String contractID, String propertyID, String tenantID, int rentAmount) {
        ContractBuilder contractBuilder = new PermanentContractBuilder();

        return contractBuilder.setContractID(contractID)
                .setPropertyID(propertyID)
                .setTenantID(tenantID)
                .setRentAmount(rentAmount)
                .signContract();
    }

    public String printInfo(Contract contract) {
        return "Contract ID: " + contract.getContractID() + "\n" +
                "Property ID: " + contract.getPropertyID() + "\n" +
                "Tenant ID: " + contract.getTenantID() + "\n" +
                "Rent Amount: " + contract.getRentAmount();
    }
}
