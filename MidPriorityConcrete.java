public class MidPriorityConcrete implements RequestProduct{
    private String priority;
    private String expireDay;
    private String status;

    public MidPriorityConcrete() {
        setStatus("");
        setExpireDay("");
        setPriority("");
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accepted";
    }

    public String getExpireDay() {
        return expireDay;
    }

    @Override
    public void setExpireDay(String expireDay) {
        this.expireDay = java.time.LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void setPriority(String priority) {
        this.priority = "Medium";
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + this.expireDay);
    }
}
