public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest(String priority, String expireDay, String status) {
        return new HighPriorityConcrete(priority, expireDay, status);
    }
}
