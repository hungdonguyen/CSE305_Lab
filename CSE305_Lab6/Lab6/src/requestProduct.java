public abstract class requestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public requestProduct(String priority, String expireDay, String status) {
        this.priority = priority;
        this.expireDay = expireDay;
        this.status = status;
    }

    public requestProduct() {
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void processRequest(String processRequest) {
        System.out.println("Processing request: " + processRequest);
    }
}
