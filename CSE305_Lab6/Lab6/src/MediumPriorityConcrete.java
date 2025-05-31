import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MediumPriorityConcrete extends RequestProduct {

    @Override
    public void setExpireDay(String expireDay) {
        // TODO Auto-generated method stub
        super.setExpireDay(LocalDate.now().plusDays(30).format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    @Override
    public void setPriority(String priority) {
        // TODO Auto-generated method stub
        super.setPriority("Medium");
    }

    @Override
    public void setStatus(String status) {
        // TODO Auto-generated method stub
        super.setStatus("Accepted");
    }

    @Override
    public void processRequest(String processRequest) {
        // TODO Auto-generated method stub
        setPriority("");
        setStatus("");
        setExpireDay("");
        super.processRequest("""
                             Request accept, estimated\r
                             completion date is : """ //
         + super.getExpireDay());
    }

}
