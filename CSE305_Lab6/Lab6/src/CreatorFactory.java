public class CreatorFactory {
    public static RequestCreator getCreator(String priorityLevel) {
        switch (priorityLevel.toLowerCase()) {
            case "low" -> {
                return new LowPriorityConcreteCreator();
            }
            case "medium" -> {
                return new MediumPriorityConcreteCreator();
            }
            case "high" -> {
                return new HighPriorityConcreteCreator();
            }
            default -> throw new IllegalArgumentException("Invalid priority level: " + priorityLevel);
        }
    }
}
