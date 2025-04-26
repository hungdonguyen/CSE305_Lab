import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {
    private List<RentalContract> listOfContract;

    public Tenant(String userID, String password, String email, String userType) {
        super(userID, password, email, userType);
        this.listOfContract = new ArrayList<>();
    }

    public List<RentalContract> getListOfContract() {
        return listOfContract;
    }

    public void requestCreateRentalContract(RentalContract contract) {
    }

    public void requestTerminateRentalContract(RentalContract contract) {

    }
}