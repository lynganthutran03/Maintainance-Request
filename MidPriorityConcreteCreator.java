public class MidPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest(String priority, String expireDay, String status) {
        return new MidPriorityConcrete(priority, expireDay, status);
    }
}
