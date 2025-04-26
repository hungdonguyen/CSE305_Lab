
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy Nhập Information");
        System.out.println("id: ");
        String id = sc.next();
        System.out.println("password: ");
        String password = sc.next();
        System.out.println("email: ");
        String email = sc.next();
        System.out.println("userType: ");
        String userType = sc.next();
        User u1 = new User(id,password,email,userType);
        u1.showUser();
    }
}
