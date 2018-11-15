import java.util.Scanner;
public class VigenereCipher {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in); 
     System.out.println("Do you want to encrypt? y or n");
     String yes = sc.next();
     if (yes.equals("y")) { 
        System.out.println("input string");
         String ori=sc.next();
         System.out.println("input key");
         String key=sc.next();
         Cipher user = new Cipher(ori, key);
         String enc = user.encrypt();
         System.out.println(enc); 
            //scanner gets string and key input and output is encrypted code
     }
     else {
         System.out.println(".");
        }
     System.out.println("Do you want to decrypt? y or n");  
     String no = sc.next(); 
     if (no.equals("y")) {
            System.out.println("input string");
            String vig=sc.next();
            System.out.println("input key");
            String key=sc.next();
            Decipher user = new Decipher(vig, key);
            String dec = user.decrypt();
            System.out.println(dec);
            //scanner gets string and key input and output is decrypted code
     }
     else {
         System.out.println(".");
        }
    }
}
