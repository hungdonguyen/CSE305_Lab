public class LowPriorityConcreteCreator implements RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new LowPriorityConcrete();
    }

}
