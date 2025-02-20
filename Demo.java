public class Demo {
    public static void main(String[] args) {
        RequestCreator lowPriority = new LowPriorityConcreteCreator();
        lowPriority.processRequest("Low", "28-2-2025", "Pending");

        RequestCreator midPriority = new MidPriorityConcreteCreator();
        midPriority.processRequest("Mid", "14-7-2025", "Pending");

        RequestCreator highPriority = new HighPriorityConcreteCreator();
        highPriority.processRequest("High", "18-12-2025", "Pending");
    }
}
