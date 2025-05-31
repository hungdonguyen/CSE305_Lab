public class MediumPriorityConcreteCreator implements RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new MediumPriorityConcrete();
    }

}
