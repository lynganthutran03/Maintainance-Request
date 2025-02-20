public class LowPriorityConcrete implements RequestProduct{
    private String priority;
    private String expireDay;
    private String status;

    public LowPriorityConcrete() {
        setStatus("");
        setExpireDay("");
        setPriority("");
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = "Done";
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
        this.priority = "Ignore";
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
