public class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest(String priority, String expireDay, String status) {
        return new LowPriorityConcrete(priority, expireDay, status);
    }
}
