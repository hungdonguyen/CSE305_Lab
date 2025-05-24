import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Contract contract = client.returnRentalContract();
        String contractInfo = contract.printInfo(contract);

        // Save contract info to a .txt file (Not encrypted)
        try (FileWriter writer = new FileWriter("contract.txt")) {
            writer.write(contractInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Save encrypted contract info to a .txt file
        String encryptedContractInfo;
        try (FileWriter writer = new FileWriter("encrypted_contract.txt")) {
            AESCipher aesCipher = new AESCipher();
            encryptedContractInfo = aesCipher.encrypt(contractInfo);
            writer.write(encryptedContractInfo);
        } catch (IOException e) {
            e.printStackTrace();
            encryptedContractInfo = null;
        }

        if (encryptedContractInfo != null) {
            String decryptedContractInfo = AESCipher.decrypt(encryptedContractInfo);
            System.out.println("Decrypted Contract Info: " + "\n  " + decryptedContractInfo);
        }
    }
}