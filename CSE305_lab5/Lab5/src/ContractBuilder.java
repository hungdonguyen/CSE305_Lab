public interface ContractBuilder {
    ContractBuilder setContractID(String contractID);
    ContractBuilder setPropertyID(String propertyID);
    ContractBuilder setTenantID(String tenantID);
    ContractBuilder setRentAmount(long rentAmount);
    Contract signContract();
}
