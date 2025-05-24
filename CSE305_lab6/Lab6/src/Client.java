public class Client {
    public Contract returnRentalContract() {
        ContractBuilder contractBuilder = new PermanentContractBuilder();

        return contractBuilder.setContractID("C12333333333333333")
                .setPropertyID("P45631311313131131")
                .setTenantID("T78931313131313131313131")
                .setRentAmount(10011001)
                .signContract();
    }

    public String printInfo(Contract contract) {
        return "Contract ID: " + contract.getContractID() + "\n" +
                "Property ID: " + contract.getPropertyID() + "\n" +
                "Tenant ID: " + contract.getTenantID() + "\n" +
                "Rent Amount: " + contract.getRentAmount();
    }
}
