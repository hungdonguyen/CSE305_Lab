import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESCipher {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final int KEY_SIZE = 128;
    private static final int IV_SIZE = 16;

    private static SecretKey secretKey;
    private static IvParameterSpec ivParameterSpec;

    static {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
            keyGen.init(KEY_SIZE);
            secretKey = keyGen.generateKey();

            byte[] iv = new byte[IV_SIZE];
            SecureRandom random = new SecureRandom();
            random.nextBytes(iv);
            ivParameterSpec = new IvParameterSpec(iv);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to initialize AES cipher", e);
        }
    }

    /**
     * Encrypts the provided string using the specified key.
     *
     * @param strToEncrypt the string to encrypt
     * @param myKey        the key to use for encryption
     * @return the encrypted string
     */
    public String encrypt(String strToEncrypt, String myKey) {
        try {
            // Derive a key from the provided key using SHA-256
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] key = sha.digest(myKey.getBytes(StandardCharsets.UTF_8));
            key = Arrays.copyOf(key, KEY_SIZE / 8); // 128 bits = 16 bytes

            // Create a SecretKeySpec from the derived key
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGORITHM);

            // Initialize the Cipher instance
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

            // Encrypt the input string
            byte[] encryptedBytes = cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8));

            // Return the encrypted bytes as a Base64-encoded string
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Failed to encrypt string", e);
        }
    }

    /**
     * Decrypts the provided string using the specified key.
     *
     * @param strToDecrypt the string to decrypt
     * @param myKey        the key to use for decryption
     * @return the decrypted string
     */
    public String decrypt(String strToDecrypt, String myKey) {
        try {
            // Derive a key from the provided key using SHA-256
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] key = sha.digest(myKey.getBytes(StandardCharsets.UTF_8));
            key = Arrays.copyOf(key, KEY_SIZE / 8); // 128 bits = 16 bytes

            // Create a SecretKeySpec from the derived key
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGORITHM);

            // Initialize the Cipher instance
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);

            // Decrypt the input string
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(strToDecrypt));

            // Return the decrypted bytes as a string
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("Failed to decrypt string", e);
        }
    }

   
}
