public class HighPriorityConcreteCreator implements RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new HighPriorityConcrete();
    }
    
}
