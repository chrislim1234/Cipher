import java.util.Scanner;
public class Decipher {
    private String vig;
    private String key;
    public Decipher(String vig1,String key1) {
        vig=vig1;
        key=key1;
    }
    public String decrypt() { //code here is exactly the same as above as the process is the same
        String text=vig;
        String majorkey=key;
        String response = "";
        text = text.toUpperCase();
        majorkey = majorkey.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char x = text.charAt(i);
            if (x < 'A' || x > 'Z') continue;
            response += (char)((x - majorkey.charAt(j)+26)%26+'A'); //only difference is the ascii turning back into character part is different 
            //as ASCII has a different number value than character number we add 26 and divide by 26 to  get this character number
            j = ++j % majorkey.length();
        }
        return response; //returns value at the end to print when called upon
    }
}