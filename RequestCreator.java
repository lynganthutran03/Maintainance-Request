public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void processRequest(String priority, String expireDay, String status) {
        RequestProduct request = createRequest();
        request.setPriority(priority);
        request.setExpireDay(expireDay);
        request.setStatus(status);
        request.processRequest();
    }
}
