public abstract class RequestCreator {
    public abstract RequestProduct createRequest(String priority, String expireDay, String status);

    public void processRequest(String priority, String expireDay, String status) {
        RequestProduct request = createRequest(priority, expireDay, status);
        request.processRequest();
    }
}
