import java.util.ArrayList;

public class PropertyOwner {
    User user;
    ArrayList<Property> listOfProperties;

    public PropertyOwner(User user, ArrayList<Property> listOfProperties) {
        this.user = user;
        this.listOfProperties = listOfProperties;
    }

    public void addProperty(Property prop){
        listOfProperties.add(prop);
    }
    public void removeProperty(Property prop){
        for (int i = 0;i<listOfProperties.size();i++){
            if (listOfProperties.get(i).getPropertyID().equals(prop.getPropertyID())){
                listOfProperties.remove(i);
                break;
            }
        }
    }
    
}
