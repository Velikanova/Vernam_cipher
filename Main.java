import javax.crypto.*;
import java.security.*;
public class Main {
  public static void main(String[] args) throws Exception {
//     KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
//     generator.initialize(1024);
//     KeyPair keyPair = generator.generateKeyPair();
//     
//     // Encrypt with PRIVATE KEY
//     Cipher cipher = Cipher.getInstance("RSA");
//     cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
//     byte[] data = cipher.doFinal("Hello!".getBytes());
//     // Decrypt with PUBLIC KEY
//     cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
//     byte[] result = cipher.doFinal(data);
//     System.out.println(new String(result));

KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
keyGen.initialize(1024);
KeyPair keypair = keyGen.genKeyPair();
PrivateKey privateKey = keypair.getPrivate();
PublicKey publicKey = keypair.getPublic();

byte[] privateKeyBytes = privateKey.getPublicKey();
byte[] publicKeyBytes = publicKey.getEncoded();


System.out.println(new String(privateKeyBytes));
System.out.println(new String(publicKeyBytes));
  }
}


