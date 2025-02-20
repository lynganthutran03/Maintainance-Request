public interface RequestProduct {
    void setPriority(String priority);
    void setExpireDay(String expireDay);
    void setStatus(String status);
    void processRequest();
}
