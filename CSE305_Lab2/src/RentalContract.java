public class RentalContract {
    int ContractID;
    int PropertyID;
    int TenantID;
    double RentAmount;
    public RentalContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        ContractID = contractID;
        PropertyID = propertyID;
        TenantID = tenantID;
        RentAmount = rentAmount;
    }
    public int getContractID() {
        return ContractID;
    }
    public void setContractID(int contractID) {
        ContractID = contractID;
    }
    public int getPropertyID() {
        return PropertyID;
    }
    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }
    public int getTenantID() {
        return TenantID;
    }
    public void setTenantID(int tenantID) {
        TenantID = tenantID;
    }
    public double getRentAmount() {
        return RentAmount;
    }
    public void setRentAmount(double rentAmount) {
        RentAmount = rentAmount;
    }
    
    public RentalContract CreateContract() {
        return new RentalContract(ContractID, PropertyID, TenantID, RentAmount);
    }

    public void TerminateContract(){
        
    }
}