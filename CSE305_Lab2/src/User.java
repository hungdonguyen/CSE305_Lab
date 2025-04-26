
import java.util.ArrayList;


public class User {
    private String userId;
    private String passWord;
    private String email;
    private String userType;
    private ArrayList<User> listUser = new ArrayList<>();


    public User(String userId, String passWord, String email, String userType) {
        this.userId = userId;
        this.passWord = passWord;
        this.email = email;
        this.userType = userType;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void createUser(String id, String password, String email, String userType) {
        User newUser = new User(id,password,email,userType);
        listUser.add(newUser);
        System.out.println("Create User Successfully");
    }

    public void resertPassword(String newPassWord) {
        this.passWord = newPassWord;
    }

    public void showUser() {
        System.out.println("id: " + this.userId);
        System.out.println("passWord: " + this.passWord);
        System.out.println("email: " + this.email);
        System.out.println("userType: " + this.userType);

    }
    
}
