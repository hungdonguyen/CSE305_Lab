public class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private long rentAmount;

    public Contract(String contractID, String propertyID, String tenantID, long rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContracttID(String contracID) {
        this.contractID = contracID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public long getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(long rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String printInfo(Contract contract) {
        return "Contract ID: " + this.contractID + "\n" +
           "Property ID: " + this.propertyID + "\n" +
           "Tenant ID: " + this.tenantID + "\n" +
           "Rent Amount: " + this.rentAmount;
    }
}