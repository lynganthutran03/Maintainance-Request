public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public HighPriorityConcrete(String priority, String expireDay, String status) {
        setStatus(status);
        setExpireDay(expireDay);
        setPriority(priority);
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accept";
    }

    public String getExpireDay() {
        return expireDay;
    }

    @Override
    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    @Override
    public void setPriority(String priority) {
        this.priority = "Emergency";
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}
