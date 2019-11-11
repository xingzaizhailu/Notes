import java.util.HashMap;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        char ch;
        for (int i = 0; i < s.length(); ++i) {
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); ++i) {
            ch = t.charAt(i);
            
            if (!map.containsKey(ch)) return false;
            else if (map.get(ch) == 1) {
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        return true; 
    }
}
// @lc code=end

