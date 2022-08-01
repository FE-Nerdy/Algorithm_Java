import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class AnotherCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        Set<String> set = new HashSet<>();
        int left, right;
        String subString = "";
        
        for (int i = 0; i < s.length(); i++) {
            left = 0;
            right = left + i;
            while (right < s.length()) {
                if (right == s.length() - 1) {
                    subString = s.substring(left);
                } else {
                    subString = s.substring(left, right + 1);
                }
                if (!set.contains(subString)) {
                    set.add(subString);
                }
                left++;
                right++;
            }
        }
        System.out.println(set.size());
    }
}