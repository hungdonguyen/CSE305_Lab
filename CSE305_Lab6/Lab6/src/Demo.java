public class Demo {
    public static void main(String[] args) throws Exception {
        // Test Low Priority Request
        System.out.println("--- Low Priority Request ---");
        RequestCreator lowCreator = CreatorFactory.getCreator("low");
        RequestProduct lowRequest = lowCreator.createRequest();
        lowRequest.processRequest("");

        System.out.println("Request Priority: " + lowRequest.getPriority());
        System.out.println("Request Status: " + lowRequest.getStatus());
        System.out.println("Request Expired: " + lowRequest.getExpireDay());
        System.out.println();

        // Test Medium Priority Request
        System.out.println("--- Medium Priority Request ---");
        RequestCreator mediumCreator = CreatorFactory.getCreator("medium");
        RequestProduct mediumRequest = mediumCreator.createRequest();
        mediumRequest.processRequest("");

        System.out.println("Request Priority: " + mediumRequest.getPriority());
        System.out.println("Request Status: " + mediumRequest.getStatus());
        System.out.println("Request Expired: " + mediumRequest.getExpireDay());
        System.out.println();

        // Test High Priority Request
        System.out.println("--- High Priority Request ---");
        RequestCreator highCreator = CreatorFactory.getCreator("high");
        RequestProduct highRequest = highCreator.createRequest();
        highRequest.processRequest("");

        System.out.println("Request Priority: " + highRequest.getPriority());
        System.out.println("Request Status: " + highRequest.getStatus());
        System.out.println("Request Expired: " + highRequest.getExpireDay());
    }
}
