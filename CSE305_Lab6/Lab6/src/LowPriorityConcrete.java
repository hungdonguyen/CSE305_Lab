import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LowPriorityConcrete extends RequestProduct {

    @Override
    public void setExpireDay(String expireDay) {
        // TODO Auto-generated method stub
        super.setExpireDay(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    @Override
    public void setPriority(String priority) {
        // TODO Auto-generated method stub
        super.setPriority("Ignore");
    }

    @Override
    public void setStatus(String status) {
        // TODO Auto-generated method stub
        super.setStatus("Done");
    }

    @Override
    public void processRequest(String processRequest) {
        // TODO Auto-generated method stub
        setPriority("");
        setStatus("");
        setExpireDay("");
        super.processRequest("Request denied");
    }

}
