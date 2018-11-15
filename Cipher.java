
import java.util.Scanner;
public class Cipher {
    private String ori;
    private String key;
    public Cipher(String ori1, String key1) {
        ori=ori1;
        key=key1;
    }
    public String encrypt() {
        String text=ori;
        String majorkey=key;
        text = text.toUpperCase(); //turns all characters to capital so code works for both lower and upper case 
        majorkey = majorkey.toUpperCase(); //same as above 
         String response = ""; //creates response so for statement can add new characters
        for (int i = 0, j = 0; i < text.length(); i++) { 
            //i represents the original text character number and j represents the key character number
            char x = text.charAt(i); 
        if (x < 'A' || x > 'Z') continue;  //makes sure that the character is valid
            response += (char)((x + majorkey.charAt(j) - 2 * 'A') % 26 + 'A'); //turns character to ascii and back to character 
            //in the code we subtract 2 'A's because the A is the first character number, removing the non-character based ASCII numbers before and dividing by 26 the remainder gives the character number value
            j = ++j % majorkey.length();    //genius code right here->as the key can be at any length so to repeat it we divide character number by key length and use remainder as new character number
        }
    return response; //returns value at the end to print when called upon
   }
}