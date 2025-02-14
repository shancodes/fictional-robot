import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {


        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> count = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(count.contains(s.charAt(j))) {
                    break;
                }
                count.add(s.charAt(j));
            }
            len = Math.max(len, count.size());
        }
        return len;
    }

}
