import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Contract contract = client.returnRentalContract();
        String contractInfo = contract.printInfo(contract);

        String secretKey = "11";
        String originalString = contractInfo;

        AESCipher testAES = new AESCipher();
        String encryptedString = testAES.encrypt(originalString, secretKey);
        String decryptedString = testAES.decrypt(encryptedString, secretKey);
        saveDataToFile(encryptedString, decryptedString);
    }

    public static void saveDataToFile(String encryptedString, String decryptedString) {
        try (FileWriter writer = new FileWriter("encrypted_data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Encrypted Data:");
            bufferedWriter.newLine();
            bufferedWriter.write(encryptedString);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("Decrypted Data:");
            bufferedWriter.newLine();
            bufferedWriter.write(decryptedString);
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }
}